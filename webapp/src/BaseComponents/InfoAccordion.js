import React from 'react';
import {makeStyles} from '@material-ui/core/styles';
import Accordion from '@material-ui/core/Accordion';
import AccordionSummary from '@material-ui/core/AccordionSummary';
import AccordionDetails from '@material-ui/core/AccordionDetails';
import Typography from '@material-ui/core/Typography';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import Paper from "@material-ui/core/Paper";
import './InfoAccordion.css';

const useStyles = makeStyles((theme) => ({
    heading: {
        fontSize: theme.typography.pxToRem(15),
        fontWeight: theme.typography.fontWeightRegular,
        color:'white'
    },
    coloring:{
        backgroundColor:'#212F3D', 
    },
    text:{
        color:'white'
    }
}));

export default function InfoAccordion(props) {
    const classes = useStyles();
    const [expanded, setExpanded] = React.useState(false);

    const handleChange = (panel) => (event, isExpanded) => {
        console.log(panel);
        setExpanded(isExpanded ? panel : false);
    };
    return (
        <Accordion className={classes.coloring} expanded={expanded === props.id} onChange={handleChange(props.id)}>
            <AccordionSummary className={"coloring"}
                expandIcon={<ExpandMoreIcon/>}
                aria-controls={props.controls}
                id={props.id}
            >
                <Typography  className={classes.heading}>{props.heading}</Typography>
            </AccordionSummary>
            <AccordionDetails>
                <Typography className={classes.text}>
                    {props.content}
                </Typography>
            </AccordionDetails>
        </Accordion>
    );
}
