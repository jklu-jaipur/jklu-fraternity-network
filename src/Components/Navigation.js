import {slide as Menu} from 'react-burger-menu';
import React from 'react';
import './Navigation.css';
class Navigation extends React.Component {
    showSettings(event) {
        event.preventDefault();
    }

    render() {
        return (
            <Menu>
                <a id='add-user' className='menu-item' href='/'>Add</a>
                <a id='contributor' className='menu-item' href='/'>Contributor</a>
                {/*<a onClick={this.showSettings} className="menu-item--small" href="">Settings</a>*/}
            </Menu>
        );
    }
}

export default Navigation;
