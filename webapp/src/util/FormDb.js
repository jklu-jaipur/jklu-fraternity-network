import {db} from '../firebase'


//github id: string, college: string, friends: array of github ids, loc=string, name=string,verified=boolean,uid to be generated
function AddUser(githubId, college, friends, location, name) {
    let batch = db.batch();
    batch.set(db.collection('users').doc(githubId.toLowerCase()), {
        clg: college,
        friends: friends,
        loc: location,
        name: name,
        githubId: githubId,
        verified: false

    });
    friends.forEach((d) => {
        batch.set(db.collection('users').doc(d.toLowerCase()), {
            clg: '',
            friends: [],
            loc: '',
            name: '',
            githubId: d,
            verified: false
        })
    });
    batch.commit()
        .then(() => {
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
