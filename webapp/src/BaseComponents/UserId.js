import React from 'react';
import TextField from '@material-ui/core/TextField';
//https://material-ui.com/components/text-fields/#layout
export default function userId(props) {
    return (
        <TextField id={'outlined-basic'} label={props.label}/>
    );
}
