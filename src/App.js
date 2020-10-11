import React, {Component} from 'react';
import './App.css';
import Navbar from './BaseComponents/Navbar.js';
import 'bootstrap/dist/css/bootstrap.min.css';
import Content from './BaseComponents/Content.js';
import Viz from './BaseComponents/Viz.js';
import Form from './BaseComponents/Form.js'


function App() {
    return (
        <div>
            <Navbar/>
            <Content/>
            <Viz/>
            <Form/>
        </div>
    );
}

export default App;
