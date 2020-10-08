import React from 'react';
import logo from './logo.svg';
import './App.css';
import Form from "./BaseComponents/Form";
import Navigation from "./BaseComponents/Navigation";
import Viz from "./BaseComponents/Viz"
import Contributors from "./BaseComponents/Contributors";

function App() {
    return (
        <div className="App">
            <Form/>
            <Viz/>
            <Navigation/>
            <Contributors/>
        </div>
    );
}

export default App;
