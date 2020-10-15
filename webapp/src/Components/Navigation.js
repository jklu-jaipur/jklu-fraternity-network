// import {scaleRotate as Menu} from 'react-burger-menu';
// import {fallDown as Menu} from 'react-burger-menu';
// import { stack as Menu} from 'react-burger-menu';
import {pushRotate as Menu} from 'react-burger-menu';
import React from 'react';
import './Navigation.css';
import Form from './UserForm.js';
import Viz from './Viz.js';
import Info from './InfoPage.js';
import Contributors from "./Contributors";
import AddIcon from '@material-ui/icons/Add';
import BlurOnIcon from '@material-ui/icons/BlurOn';
import EmojiPeopleIcon from '@material-ui/icons/EmojiPeople';
import CommentIcon from '@material-ui/icons/Comment';


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
                    <span className="jk-tag">JKLU Fraternity Network</span>
                    {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
                    <a id='viz' href={'#'} onClick={() => this.setState({
                        showViz: true,
                        showInfo: false,
                        showRegistration: false,
                        showContributor: false,
                        menuOpen: false
                    })} className='menu-item'><BlurOnIcon/> Home</a>{}
                    {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
                    <a id='add-user' href={'#'} onClick={() => this.setState({
                        showRegistration: true,
                        showInfo: false,
                        showViz: false,
                        showContributor: false,
                        menuOpen: false
                    })} className='menu-item'><AddIcon/> Registration</a>{}
                    {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
                    <a id='info' href={'#'} onClick={() => this.setState({
                        showInfo: true,
                        showViz: false,
                        showRegistration: false,
                        showContributor: false,
                        menuOpen: false
                    })} className='menu-item'><CommentIcon/> Info</a>{}
                    {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
                    <a id='contributor' href={'#'} onClick={() => this.setState({
                        showContributor: true,
                        showInfo: false,
                        showRegistration: false,
                        showViz: false,
                        menuOpen: false
                    })} className='menu-item'><EmojiPeopleIcon/> Contributors</a>
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
