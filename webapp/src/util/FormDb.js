import {db} from '../firebase'


//github id: string, college: string, friends: array of github ids, loc=string, name=string,verified=boolean,uid to be generated
function AddUser(githubId, college, friends, location, name, token) {
    db.collection('users').doc(githubId.toLowerCase()).set({
        clg: college,
        friends: friends,
        loc: location,
        name: name,
        token: token,
        githubId: githubId,
        verified: false

    }).then(() => {
        console.log('Written')

    }).catch(error => {
        console.error(error)
    });
}

function ReadUsers() {
    return db.collection('users').get()
        .then(querySnapshot => {
            return querySnapshot.docs.map(doc => doc.data());
        });
}


export {AddUser, ReadUsers}
