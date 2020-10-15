import React from 'react';
import TextField from '@material-ui/core/TextField';

export default function userId(props) {
    return (
        <TextField id={'outlined-basic'} label={props.label}/>
    );
}
