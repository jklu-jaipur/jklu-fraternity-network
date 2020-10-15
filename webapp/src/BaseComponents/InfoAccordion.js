import React from 'react';
import {makeStyles} from '@material-ui/core/styles';
import Accordion from '@material-ui/core/Accordion';
import AccordionSummary from '@material-ui/core/AccordionSummary';
import AccordionDetails from '@material-ui/core/AccordionDetails';
import Typography from '@material-ui/core/Typography';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import './InfoAccordion.css';
import Pic from '../media/hack.png';


const useStyles = makeStyles((theme) => ({
    heading: {
        fontSize: theme.typography.pxToRem(15),
        fontWeight: theme.typography.fontWeightRegular,
        color: 'white'
    },
    coloring: {
        backgroundColor: '#2980B9',
    },
    text: {
        color: 'white'
    }
}));

export default function InfoAccordion(props) {
    const classes = useStyles();
    const [expanded, setExpanded] = React.useState(false);
    // const image =[Pic,Git];

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
                <Typography classename={"text-style"} className={classes.heading}>{props.heading}</Typography>
            </AccordionSummary>
            <AccordionDetails className={props.isImage ? "disp-poster" : "disp-text"}>
                {props.isImage ? <img width="auto" height="auto" src={Pic} alt={'Hacktoberfest'}/> : null}
                <div className={props.isImage ? "disp-poster-text" : "disp-poster-text-1"}>
                    <Typography className={["text-style", classes.text].join(' ')} component={'span'}>
                        {props.content}
                    </Typography>
                </div>
            </AccordionDetails>
        </Accordion>
    );
}
