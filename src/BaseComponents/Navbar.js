import React, {Component} from 'react';
import {Navbar, Spinner, Button, Container, Row, Col, Form, FormControl} from 'react-bootstrap';
import logo from '../logo.svg';
import './Navbar.css';
import Form1 from './Form.js';
import Contri from'./Contributors.js';
import Viz from './Viz.js';


class navbarr extends Component{

   check(){
    document.querySelector('.graph-1').classList.add("graph-2");
    
    if(document.getElementById("para-1").classList=="nav-open"){
        if(document.getElementById("para-2").classList=="cont-open"){
            document.querySelector('.graph-1').classList.remove("graph-2");
        }
    }
   }
    
    operation(){
        document.querySelector('.nav-open').classList.toggle('nav-open-1');
        
        this.check();
        if(document.querySelector('.cont-open').classList!='cont-open'){
            document.querySelector('.cont-open-1').classList.remove('cont-open-1');
            
        }          
    }
    operation1(){
        document.querySelector('.cont-open').classList.toggle('cont-open-1');     
        this.check();
        if(document.querySelector('.nav-open').classList!='nav-open'){
            document.querySelector('.nav-open-1').classList.remove('nav-open-1');
            
        }  
        
    }
    render(){
        return(
            <div >
                <Navbar bg="dark" variant="dark" className="justify-content-between">
                    <Navbar.Brand href="#home">
                    <img
                        alt=""
                        src={logo}
                        width="30"
                        height="30"
                        className="d-inline-block align-top"
                    />{' '}
                    Visualization
                    </Navbar.Brand>
                    <Form inline>
                    <Form inline>
                        <Button variant="outline-info" onClick={()=>this.operation()} className="but-1">Register</Button>
                        <Button variant="outline-info" onClick={()=>this.operation1()} >Contributors</Button>
                    </Form>
                    </Form>                    
                    </Navbar>   
                    
                    <div className="nav-open " id='para-1'>  
                        <Form1 />
                    </div>         
                    <div className="cont-open" id="para-2">
                        <Contri />
                    </div>
                    <div className="graph-1">
                        <Viz />
                    </div>
            </div>
        );
    }
}

export default navbarr;
