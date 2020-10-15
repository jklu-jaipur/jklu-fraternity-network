import React from "react";
import Paper from "@material-ui/core/Paper";
import {makeStyles} from '@material-ui/core/styles';
import './InfoPage.css';
import InfoAccordion from "../BaseComponents/InfoAccordion";

const useStyles = makeStyles((theme) => ({
    root: {
        width: '80%',
        marginLeft:'10%',
        
    },
    heading: {
        fontSize: theme.typography.pxToRem(15),
        fontWeight: theme.typography.fontWeightRegular,
        backgroundColor:'red'
    },
}));
const openSourceInfo = [
    {
        key: 0,
        controls: 'zero',
        id: 'zero',
        heading: 'Hello, JKLU',
        content: 'This web app is focused on your contribution towards \'JKLU-Jaipur\' Group (on GITHUB).\n'
            
    }, {
        key: 1,
        controls: 'one',
        id: 'one',
        heading: 'Steps for Pull request',
        content: 'Steps in order to show your profile name on Graph i.e. Home page.`{"\n"}' +
            '                            `{"\n"}' +
            '                            1) Make Pull Request (hope you have recieved a mail on this).`{"\n"}' +
            '                            2) Try to make a valuable and good contribution.`{"\n"}' +
            '                            3) We will review your code.`{"\n"}' +
            '                            4) If you pull request got merged your name will appear in the graph.`{"\n"}' +
            '                            5) Cool, you have done your',
    }
];

export default function InfoPage() {
    const classes = useStyles();
    const accordions = [];
    for (const value of openSourceInfo) {
        accordions.push(InfoAccordion(value))
    }
    return (
        <div>
            <Paper elevation={6}>
                <div className="Head-part-1">
                    <h1 className='Head-part-2'>Welcome to Open Source!</h1>
                </div>
            </Paper>
            <br/>
            <br/>

            <div className={classes.root}>
                {
                    accordions
                }
            </div>

        </div>

    );


}

