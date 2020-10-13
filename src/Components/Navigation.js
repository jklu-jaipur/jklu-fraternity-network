import {slide as Menu} from 'react-burger-menu';
import React from 'react';
import './Navigation.css';
import {Button} from '@material-ui/core';
import Form from './Form.js';
import Viz from './Viz.js';
import Contributors from "./Contributors";

class Navigation extends React.Component {
    state={
        shown:true,
        shown1:false,
        shown2:false
    };

    showSettings(event) {
        event.preventDefault();
    }

    render() {
        return (
            <div>
                
                <Menu>
                    <a  id='add-user' onClick={()=>this.setState({shown:true,shown1:false,shown2:false})} className='menu-item'>Home</a>{}
                    <a  id='add-user' onClick={()=>this.setState({shown1:true,shown:false,shown2:false})} className='menu-item'>Registration</a>{}
                    <a  id='contributor' onClick={()=>this.setState({shown2:true,shown1:false,shown:false})} className='menu-item'>Contributors</a>
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
