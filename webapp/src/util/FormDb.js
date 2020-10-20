import {db} from '../firebase'

function getFriends(friends) {
    let final = [];
    friends.forEach((f) => {
        final.push(f.gitId);
    });
    return final;
}

function addToBatch(batch, id) {

    batch.set(db.collection('users').doc(id.gitId.toLowerCase()), {
        clg: '',
        friends: [],
        loc: '',
        name: id.gitId,
        githubId: id.gitId,
        verified: false,
        avatar: id.avatar,
        repos: id.pubRepo
    })

}

//github id: string, college: string, friends: array of github ids, loc=string, name=string,verified=boolean,uid to be generated
function AddUser(githubId, college, friends, location, name) {
    let batch = db.batch();
    db.collection('users').doc(githubId.gitId.toLowerCase()).get().then(docSnapshot => {
        let friendList = [];
        let verify='';
        if (docSnapshot.exists) {
            friendList = docSnapshot.data()['friends'];
            verify=docSnapshot.data()['verified'];
        }
        return {friendList,verify}
    }).then(({friendList,verify}) => {
        return batch.set(db.collection('users').doc(githubId.gitId.toLowerCase()), {
            clg: college,
            friends: [...new Set(friendList.concat(getFriends(friends)))],
            loc: location,
            name: name,
            githubId: githubId.gitId,
            verified: verify,
            avatar: githubId.avatar,
            repos: githubId.pubRepo
        });
    });
    db.collection('users').doc(friends[0].gitId.toLowerCase()).get().then(docSnapshot => {
        //console.log(batch);
        if (!docSnapshot.exists) {
            addToBatch(batch, friends[0]);
        }
    }).then(() => {
        //console.log(batch);
        return db.collection('users').doc(friends[1].gitId.toLowerCase()).get().then(docSnapshot => {
            if (!docSnapshot.exists) {
                addToBatch(batch, friends[1]);
            }
        })
    }).then(() => {
        //console.log(batch);
        if (friends.length >= 3) {
            //console.log(batch);
            return db.collection('users').doc(friends[2].gitId.toLowerCase()).get().then(docSnapshot => {
                if (!docSnapshot.exists) {
                    addToBatch(batch, friends[1]);
                }
            })
        }
    }).then(() => {
        //console.log(batch);
        if (friends.length >= 4) {
            //console.log(batch);
            return db.collection('users').doc(friends[3].gitId.toLowerCase()).get().then(docSnapshot => {
                if (!docSnapshot.exists) {
                    addToBatch(batch, friends[3]);
                }
            })
        }
    }).then(() => {
        //console.log(batch);
        return batch.commit();
    });
}

function ReadUsers() {
    return db.collection('users').get()
        .then(querySnapshot => {
            return querySnapshot.docs.map(doc => doc.data());
        });
}


export {AddUser, ReadUsers}
