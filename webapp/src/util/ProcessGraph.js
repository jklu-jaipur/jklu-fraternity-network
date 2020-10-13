export default function ProcessDbRead(data) {
    // console.log(data);
    let user;
    let processedData = [];
    console.log(data);
    for (user of data) {
        if (user['verified'] === true) {
            processedData.push({
                'name': user['name'],
                'value': user['friends'].length,
                'friends': user['friends'],
                'githubId': user['githubId']
            });
        }
    }
    return processedData;
}
