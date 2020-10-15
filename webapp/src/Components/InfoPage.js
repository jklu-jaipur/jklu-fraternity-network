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
        content: [['Steps in order to show your profile name on Graph i.e. Home page.' ],
                  ['1) Make Pull Request (hope you have recieved a mail on this).'],
                  ['2) Try to make a valuable and good contribution.'],
                  ['3) We will review your code.'],
                  ['4) If you pull request got merged your name will appear in the graph.'],
                  ['5) Cool, you have done your']],
    },
    {
        key: 2,
        controls: 'two',
        id: 'two',
        heading: 'Open source',
        content: [['Open source projects are a great way of developing quality products by working together with other developers. You create code that benefits the community.' ],
                  ['Contributing to open source can be a rewarding way to learn, teach, and build experience in just about any skill you can imagine. Open source gives you a feel that how things work in production.']],

    },
    {
        key: 3,
        controls: 'three',
        id: 'three',
        heading: 'Github',
        content: [['GitHub is an open-source version-control and collaboration platform for software developers.' ],
                  ['Git is used to store the source code for a project and track the complete history of all changes to that code. It allows developers to collaborate on a project more effectively by providing tools for managing possibly conflicting changes from multiple developers.']],

    },
    {   
        key: 4,
        controls: 'four',
        id: 'four',
        heading: 'Hacktoberfest',
        content: [['Hacktoberfest is open to everyone in our global community.' ],
                  ['Whether you’re a developer, student learning to code, event host, or company of any size, you can help drive growth of open source and make positive contributions to an ever-growing community.'],
                  ['All backgrounds and skill levels are encouraged to complete the challenge.'],
                  ['1) •	Hacktoberfest is a celebration open to everyone in our global community.'],
                  ['2) •	Pull requests can be made in participating GitHub-hosted repositories/projects, classified with the Hacktoberfest topic.']],

    },
    
    

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

