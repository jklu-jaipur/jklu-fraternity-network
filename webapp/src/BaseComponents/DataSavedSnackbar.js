import React from 'react';
import Snackbar from '@material-ui/core/Snackbar';
import MuiAlert from '@material-ui/lab/Alert';

function Alert(props) {
    return <MuiAlert elevation={6} variant="filled" {...props} />;
}

export default function DataSavedSnackbar(props) {
    return (
        <div >
            <Snackbar open={props.snackbarOpen} autoHideDuration={600}
            anchorOrigin={{vertical:'bottom',horizontal:'left'}}>
                <Alert severity={props.severity}>
                    {props.msg}

                </Alert>
            </Snackbar>

        </div>
    );
}
