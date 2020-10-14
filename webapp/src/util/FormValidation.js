import {AddUser} from './FormDb';
import {Octokit} from '@octokit/core'


import pat from  '../settings';


async function validateGithubId(id) {
    const kit = new Octokit({auth: pat.pat, userAgent: 'network-jklu-webapp'});
    return await kit.request('GET /users/' + id, {});
}

function getRequiredFields(result) {

    return {
        'gitId': result.data.login,
        'avatar': result.data.avatar_url,
        'pubRepo': result.data.public_repos
    }
}

export default function FormValidation(gitId, clg, frndOne, frndTwo, frndThree, frndFour, loc, name) {
    let friends = [];
    let unqFriends = new Set();
    unqFriends.add(frndOne);
    unqFriends.add(frndTwo);
    unqFriends.add(frndThree);
    unqFriends.add(frndFour);
    unqFriends.delete('');
    unqFriends = Array.from(unqFriends);
    let mainUser = {};
    return validateGithubId(gitId).then(res => {
        mainUser = getRequiredFields(res);
        if (unqFriends.includes(gitId) || unqFriends.length < 2) {
            return false
        }
        return validateGithubId(unqFriends[0]);
    }).then(res => {
        if (res) {
            friends.push(getRequiredFields(res));
            return validateGithubId(unqFriends[1]);
        }
        return false
    }).then(res => {
        if (res) {
            friends.push(getRequiredFields(res));
            if (unqFriends.length >= 3) {
                return validateGithubId(unqFriends[2]);
            } else {
                return true
            }
        }
        return false
    }).then(res => {
        if (res === false) {
            return false
        }
        if (res !== true) {
            friends.push(getRequiredFields(res));
            if (unqFriends.length === 4) {
                return validateGithubId(unqFriends[3])
            }
        }
        return true
    }).then(res => {

        if (res === false) {
            return false
        }
        if (res !== true) {
            friends.push(getRequiredFields(res));
        }
        return AddUser(mainUser, clg, friends, loc, name);
    })
}

