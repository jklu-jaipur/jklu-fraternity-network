import React, {Component} from 'react';
import {TextField, FormGroup} from '@material-ui/core';
import UserId from '../BaseComponents/UserId';
import './NewUserForm.css';
import Card from '@material-ui/core/Card'
import CardContent from '@material-ui/core/CardContent'

class NewUserForm extends Component {
    render() {
        return (
            <Card variant={'outlined'}>
                <CardContent>
                <FormGroup>
                    <UserId label={'Github Id'}/>
                </FormGroup>
                </CardContent>
            </Card>
        );
    }
}

export default NewUserForm;
