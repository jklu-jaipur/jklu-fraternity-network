import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Accordion from '@material-ui/core/Accordion';
import AccordionSummary from '@material-ui/core/AccordionSummary';
import AccordionDetails from '@material-ui/core/AccordionDetails';
import Typography from '@material-ui/core/Typography';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import Paper from "@material-ui/core/Paper";
import './info.css';

const useStyles = makeStyles((theme) => ({
  root: {
    width: '100%',
    display:'flex',
    justifyContent:'center',
    marginTop:'20px',
    
  },
  heading: {
    fontSize: theme.typography.pxToRem(15),
    fontWeight: theme.typography.fontWeightRegular,
  },
}));

export default function SimpleAccordion() {
  const classes = useStyles();

  return (
    <div >
        <Paper elevation={6}>
            <div className="Head-part-1">
                <h1 className='Head-part-2'>Welcome to Open Source!</h1>
            </div>
        </Paper>
        <br />
        <br />
        <div className={classes.root}>
            <Paper elevation={6}>
            <Accordion expanded={true}>
                <AccordionSummary
                expandIcon={<ExpandMoreIcon />}
                aria-controls="panel1a-content"
                id="panel1a-header"
                >
                <Typography className={classes.heading}>Hello, JKLU</Typography>
                </AccordionSummary>
                <AccordionDetails>
                <Typography>
                This web app is focused on your contribution towards 'JKLU-Jaipur' Group (on GITHUB).<br />
                Steps in order to show your profile name on Graph i.e. Home page.
                </Typography>
                </AccordionDetails>
            </Accordion>
            </Paper>
        </div>
        <div className={classes.root}>
            <Paper elevation={6}>
                <Accordion>
                    <AccordionSummary
                    expandIcon={<ExpandMoreIcon />}
                    aria-controls="panel1a-content"
                    id="panel1a-header"
                    >
                    <Typography className={classes.heading}>Steps for Pull request</Typography>
                    </AccordionSummary>
                    <AccordionDetails>
                    <Typography>
                    Steps in order to show your profile name on Graph i.e. Home page.
                    <br />        
                    1) Make Pull Request (hope you have recieved a mail on this).<br />
                    2) Try to make a valuable and good contribution.<br />
                    3) We will review your code.<br />
                    4) If you pull request got merged your name will appear in the graph.<br />
                    5) Cool, you have done your
                    </Typography>
                    </AccordionDetails>
                </Accordion>
            </Paper>
        </div>
    </div>
  );
}
