// import {scaleRotate as Menu} from 'react-burger-menu';
// import {fallDown as Menu} from 'react-burger-menu';
// import { stack as Menu} from 'react-burger-menu';
import {pushRotate as Menu, CustomIcon} from 'react-burger-menu';
import React from 'react';
import './Navigation.css';
import {Button} from '@material-ui/core';
import Form from './UserForm.js';
import Viz from './Viz.js';
import Contributors from "./Contributors";
import AddIcon from '@material-ui/icons/Add';
import Icon from '@material-ui/core/Icon';
import { makeStyles } from '@material-ui/core/styles';
import SvgIcon from '@material-ui/core/SvgIcon';
import BlurOnIcon from '@material-ui/icons/BlurOn';
import EmojiPeopleIcon from '@material-ui/icons/EmojiPeople';

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
      <path d="M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z" />
    </SvgIcon>
  );
}

class Navigation extends React.Component {
    
    constructor (props) {
      super(props)
      this.state = {
        menuOpen: false,
        shown:true,
        shown1:false,
        shown2:false
      }
    }

    showSettings(event) {
        event.preventDefault();
    }
    closeMenu () {
      this.setState({menuOpen: false})
    }
    handleStateChange (state) {
      this.setState({menuOpen: state.isOpen})  
    }
    toggleMenu () {
      this.setState(state => ({menuOpen: !state.menuOpen}))
    }
    render() {
        return (
          
            <div>
                
                <Menu isOpen={this.state.menuOpen} onStateChange={(state) => this.handleStateChange(state)}> 
                    <a  id='add-user' onClick={()=>this.setState({shown:true,shown1:false,shown2:false,menuOpen:false})} className='menu-item'><BlurOnIcon />  Home</a>{}
                    <a  id='add-user' onClick={()=>this.setState({shown1:true,shown:false,shown2:false,menuOpen:false})}  className='menu-item'><AddIcon />  Registration</a>{}
                    <a  id='contributor' onClick={()=>this.setState({shown2:true,shown1:false,shown:false,menuOpen:false})}  className='menu-item'><EmojiPeopleIcon />  Contributors</a>
                    {/*<a onClick={this.showSettings} className="menu-item--small" href="">Settings</a>*/}
                    
                </Menu>
                <div>
                    {this.state.shown ? <Viz />: null}
                    {this.state.shown1 ? <Form/> : null }
                    {this.state.shown2 ? <Contributors /> : null}
                
                </div>
            </div>
            
        );
    }
}

export default Navigation;
