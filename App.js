import React , { useEffect, useState } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navigation from "./Components/Navigation";
import UserForm from "./Components/UserForm";


function App() {
    const[dark, setMode] = useState(false)
    
        
    return (
    
        <div className= {dark ? "App dark-mode": "App"} >

        
            <div className='nav'>
                <label className="switch" >
                    <input
                     type="checkbox"
                     onChange={()=>setMode(!dark)}
                      />
                    <span className="slider round"></span> 
                </label>
                
            </div>

            <div className="content">
            <Navigation/>
            </div>
            
        </div>
    


    );
}

export default App;