import {AddUser} from './FormDb';

function ValidateGithubId(id) {
    return true
    return false
}


export default function FormValidation(gitId, clg, frndOne, frndTwo, frndThree, frndFour, loc, name) {
    let friends = [];
    if (ValidateGithubId(gitId) === true) {
        if (gitId !== frndOne && gitId !== frndTwo && gitId !== frndThree && gitId !== frndFour) {
            if (frndOne !== frndTwo && ValidateGithubId(frndOne) && ValidateGithubId(frndTwo)) {
                friends.push(frndOne);
                friends.push(frndTwo);
                if (frndThree !== '' && ValidateGithubId(frndThree)) {
                    friends.push(frndThree);
                }
                if (frndFour !== '' && ValidateGithubId(frndFour)) {
                    friends.push(frndFour);
                }
                AddUser(gitId, clg, friends, loc, name);
            }
        }
    }
}
