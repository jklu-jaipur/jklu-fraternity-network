import React from 'react';
import './ContributorCard.css';
import logo from '../media/download.png';
import {makeStyles} from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import CardMedia from '@material-ui/core/CardMedia';
import Paper from '@material-ui/core/Paper';

const useStyles = makeStyles({
    root: {
        minWidth: 275,
    },
    bullet: {
        display: 'inline-block',
        margin: '0 2px',
        transform: 'scale(0.8)',
    },
    title: {
        fontSize: 14,
    },
    pos: {
        marginBottom: 12,
    },
});

function ContributorCard(props) {
    const classes = useStyles();
    // const bull = <span className={classes.bullet}>•</span>;
    return (

        <div className="headname">
            <Paper elevation={10}>
                <Card className={classes.root} elevation={3} variant="outlined">
                    <CardContent className="color-cards">
                        <CardMedia
                            component="img"
                            alt={props.name}
                            height="241"
                            image={logo}
                            title={props.name}
                        />
                        <Typography variant="h5" component="h2">
                            {props.name}
                        </Typography>
                        <Typography className={classes.pos} color="textSecondary">
                            {props.about}
                        </Typography>
                        <Typography variant="body2" component="p">
                            JKLU
                        </Typography>
                    </CardContent>
                    <CardActions>
                        <div className="main">
                            <Button color="primary" href={props.linkedin} target="_blank" >LINKEDIN</Button>
                            <Button className="button-set" href={props.github} target="_blank">GITHUB</Button>
                        </div>
                    </CardActions>
                </Card>
            </Paper>
        </div>
    );

}

export default ContributorCard;
