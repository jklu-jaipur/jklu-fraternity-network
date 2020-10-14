// import {scaleRotate as Menu} from 'react-burger-menu';
// import {fallDown as Menu} from 'react-burger-menu';
// import { stack as Menu} from 'react-burger-menu';
import {pushRotate as Menu, CustomIcon} from 'react-burger-menu';
import React from 'react';
import './Navigation.css';
import {Button} from '@material-ui/core';
import Form from './UserForm.js';
import Viz from './Viz.js';
import Info from './info.js';
import Contributors from "./Contributors";
import AddIcon from '@material-ui/icons/Add';
import Icon from '@material-ui/core/Icon';
import {makeStyles} from '@material-ui/core/styles';
import SvgIcon from '@material-ui/core/SvgIcon';
import BlurOnIcon from '@material-ui/icons/BlurOn';
import EmojiPeopleIcon from '@material-ui/icons/EmojiPeople';
import CommentIcon from '@material-ui/icons/Comment';

const useStyles = makeStyles((theme) => ({
    root: {
        '& > svg': {
            margin: theme.spacing(2),
        },
    },
}));

function HomeIcon(props) {
    return (
        <SvgIcon {...props}>
            <path d="M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z"/>
        </SvgIcon>
    );
}

class Navigation extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            menuOpen: false,
            showInfo: false,
            showViz: true,
            showRegistration: false,
            showContributor: false
        }
    }

    showSettings(event) {
        event.preventDefault();
    }

    closeMenu() {
        this.setState({menuOpen: false})
    }

    handleStateChange(state) {
        this.setState({menuOpen: state.isOpen})
    }

    toggleMenu() {
        this.setState(state => ({menuOpen: !state.menuOpen}))
    }

    render() {
        return (
            <div>

                <Menu isOpen={this.state.menuOpen} onStateChange={(state) => this.handleStateChange(state)}>
                    <span className="jk-tag">JKLU</span>
                    <a id='info' onClick={() => this.setState({
                        showInfo: true,
                        showViz: false,
                        showRegistration: false,
                        showContributor: false,
                        menuOpen: false
                    })} className='menu-item'><CommentIcon/> Info</a>{}
                    <a id='viz' onClick={() => this.setState({
                        showViz: true,
                        showInfo: false,
                        showRegistration: false,
                        showContributor: false,
                        menuOpen: false
                    })} className='menu-item'><BlurOnIcon/> Home</a>{}
                    <a id='add-user' onClick={() => this.setState({
                        showRegistration: true,
                        showInfo: false,
                        showViz: false,
                        showContributor: false,
                        menuOpen: false
                    })} className='menu-item'><AddIcon/> Registration</a>{}
                    <a id='contributor' onClick={() => this.setState({
                        showContributor: true,
                        showInfo: false,
                        showRegistration: false,
                        showViz: false,
                        menuOpen: false
                    })} className='menu-item'><EmojiPeopleIcon/> Contributors</a>
                    {/*<a onClick={this.showSettings} className="menu-item--small" href="">Settings</a>*/}
                </Menu>
                <div>
                    {this.state.showInfo ? <Info/> : null}
                    {this.state.showViz ? <Viz/> : null}
                    {this.state.showRegistration ? <Form/> : null}
                    {this.state.showContributor ? <Contributors/> : null}

                </div>
            </div>

        );
    }
}

export default Navigation;
