import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Viz from './Components/Viz.js';
import Navigation from "./Components/Navigation";
import NewUserForm from './Components/NewUserForm.js'
import Contributors from "./Components/Contributors";
import ContributorCard from "./BaseComponents/ContributorCard";
import Form from './Components/Form.js';

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
