import React, {Component} from 'react';
import {Navbar, Spinner, Button, Container, Row, Col, Form, FormControl} from 'react-bootstrap';
import logo from '../logo.svg';
import './Navbar.css';

class navbarr extends Component{
    render(){
        return(
            <div>
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
                    <Button variant="primary" className="mr-sm-2" disabled>
                        <Spinner
                                        
                            as="span"
                            animation="grow"
                            size="sm"
                            role="status"
                            aria-hidden="true"
                            />
                            Loading...
                        </Button>
                    </Form>                    
                    </Navbar>            
            </div>
        );
    }
}

export default navbarr;
