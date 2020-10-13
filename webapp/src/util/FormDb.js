import {db} from '../firebase'

function getFriends(friends){
    let final=[];
    friends.forEach((f)=>{
        final.push(f.gitId);
    })
    return final;
}
//github id: string, college: string, friends: array of github ids, loc=string, name=string,verified=boolean,uid to be generated
function AddUser(githubId, college, friends, location, name) {
    let batch = db.batch();
    batch.set(db.collection('users').doc(githubId.gitId.toLowerCase()), {
        clg: college,
        friends: getFriends(friends),
        loc: location,
        name: name,
        githubId: githubId.gitId,
        verified: false,
        avatar: githubId.avatar,
        repos: githubId.pubRepo

    });
    friends.forEach((d) => {
        batch.set(db.collection('users').doc(d.gitId.toLowerCase()), {
            clg: '',
            friends: [],
            loc: '',
            name: '',
            githubId: d.gitId,
            verified: false,
            img: d.avatar,
            repos: d.pubRepo
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
