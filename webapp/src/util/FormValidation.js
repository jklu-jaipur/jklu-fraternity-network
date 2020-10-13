import {AddUser} from './FormDb';
import {Octokit} from '@octokit/core'

async function validateGithubId(id) {
    const kit = new Octokit();
    return await kit.request('GET /users/' + id, {});
}


export default function FormValidation(gitId, clg, frndOne, frndTwo, frndThree, frndFour, loc, name) {
    let friends = [];
    let unqFriends = new Set();
    unqFriends.add(frndOne.toLowerCase());
    unqFriends.add(frndTwo.toLowerCase());
    unqFriends.add(frndThree.toLowerCase());
    unqFriends.add(frndFour.toLowerCase());
    let dp = [];
    validateGithubId(gitId).then(res => {
        console.log(res);
        console.log(unqFriends);
        if (unqFriends.has(gitId.toLowerCase())) {
            console.log(unqFriends);
            return false
        }
        return validateGithubId(frndOne);
    }).then(res => {
        console.log(res);
        if (res) {
            friends.push(frndOne);
            return validateGithubId(frndTwo);
        }
        return false
    }).then(res => {
        console.log(res);
        if (res) {
            friends.push(frndTwo);
            if (unqFriends.size >= 4) {
                return validateGithubId(frndThree);
            } else {
                return true
            }
        }
        return false
    }).then(res => {
        console.log(res);
        if (res === false) {
            return false
        }
        if (res !== true) {
            friends.push(frndThree);
            console.log(unqFriends);
            console.log(unqFriends[3]);
            if (unqFriends[3]!=="") {
                console.log('down');
                return validateGithubId(frndFour)
            }
        }
        return true
    }).then(res => {
        console.log('en');
        console.log(res);
        if (res === false) {
            console.log('falsjflj');
            return false
        }
        if (res !== true) {
            friends.push(frndFour);
        }
        console.log('add user called');
        AddUser(gitId, clg, friends, loc, name);
        console.log(res);
    }).catch(error => {
        console.error(error);
    });

}

