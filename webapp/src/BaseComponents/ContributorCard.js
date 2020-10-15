import React from 'react';
import './ContributorCard.css';
import {makeStyles} from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import CardMedia from '@material-ui/core/CardMedia';
import Paper from '@material-ui/core/Paper';
import zero from '../media/zero.png';
import one from '../media/one.png';
import two from '../media/two.png';
import three from '../media/three.png';

const img = [zero, one, two, three];
const useStyles = makeStyles({
    root: {
        minWidth: 275,
        fontFamily: 'Work Sans'
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
                    <CardContent>
                        <CardMedia
                            component="img"
                            alt={props.name}
                            height="241"
                            image={img[props.img]}
                            title={props.name}
                        />
                        <Typography className="color-cards" variant="h5" component="h2">
                            {props.name}
                        </Typography>
                        <Typography className={["color-cards", classes.pos].join(' ')} color="textSecondary">
                            {props.about}
                        </Typography>
                        <Typography className="color-cards" variant="body2" component="p">
                            JKLU
                        </Typography>
                    </CardContent>
                    <CardActions>
                        <div className="main">
                            <Button className="color-cards" color="primary" href={props.linkedin}
                                    target="_blank">LINKEDIN</Button>
                            <Button className={["color-cards", "button-set"].join(' ')} href={props.github}
                                    target="_blank">GITHUB</Button>
                        </div>
                    </CardActions>
                </Card>
            </Paper>
        </div>
    );

}

export default ContributorCard;
