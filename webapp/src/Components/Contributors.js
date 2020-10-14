import React from 'react';
import ContributorCard from "../BaseComponents/ContributorCard";
import Paper from '@material-ui/core/Paper';
import TextField from "@material-ui/core/TextField";
import {Button} from "@material-ui/core";
class Contributors extends React.Component {
    render() {
        return (
            <div>
                <Paper elevation={10}>
                <div className="headname">
                    <div>
                        <p>Designed & Developed by</p>
                    </div>

                </div>
                </Paper>
                <div className="headName">
                    <ContributorCard name='Dr.Alok Kumar' about='Faculty CSE'/>
                    <ContributorCard name='Shubham Bhandari' about='IV Year CSE'/>
                    <ContributorCard name='Harsh Udai' about='III Year CSE'/>
                    <ContributorCard name='Samyak Bhagat' about='III Year CSE'/>
                </div>
            </div>
        );
    }
}

export default Contributors;
