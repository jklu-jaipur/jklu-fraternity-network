import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Viz from './Components/Viz.js';
import Navigation from "./Components/Navigation";
import Contributors from "./Components/Contributors";
import ContributorCard from "./BaseComponents/ContributorCard";
import Form from './Components/UserForm.js';

function App() {
    return (
        <div>
            <Navigation/>
            
        </div>
        // <div>
        //     < Contributors />
        // </div>
    );
}

export default App;
