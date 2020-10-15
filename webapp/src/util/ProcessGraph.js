export default function ProcessDbRead(data) {
    let user;
    let processedData = [];
    //console.log(data);
    for (user of data) {
        if (user['verified'] === true) {
            processedData.push({
                'name': '',
                'value': 1,
                'friends': user['friends'],
                'githubId': user['githubId'],
                'avatar': user['avatar'],
                'publicRepo': user['repos'],
                'nameWithAvatar': user['name']
            });
        }
        // } else {
        //     processedData.push({
        //         'name': user['name'],
        //         'value': 0,
        //         'friends': user['friends'],
        //         'githubId': user['githubId'],
        //         'avatar': '',
        //         'nameWithAvatar': '',
        //         'publicRepo':user['repos']
        //     })
        // }
    }
    return processedData;
}
