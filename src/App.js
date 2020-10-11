import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Viz from './Components/Viz.js';
import Navigation from "./Components/Navigation";
import NewUserForm from './Components/NewUserForm.js'
import Contributors from "./Components/Contributors";
import ContributorCard from "./BaseComponents/ContributorCard";

function App() {
    return (
        <div>
            <Navigation/>
            <Viz/>
        </div>
    );
}

export default App;
