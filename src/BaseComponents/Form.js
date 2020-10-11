import React,{Component} from 'react';
import {Form,FormGroup,Button} from 'react-bootstrap';
import './Form.css';


  
class form extends Component{
    render(){
        return(
            
            
            <div className="main-control">
                <h1 className="head">Registration</h1>
                <div className="maincon">
                <Form className="justify-content-center">
                    <Form.Group controlId="exampleForm.ControlInput1">
                        <Form.Label>Email address</Form.Label>
                        <Form.Control type="email" className="part-1" placeholder="name@example.com" />
                    </Form.Group>
                    <Form.Group controlId="exampleForm.ControlInput1">
                        <Form.Label>Github ID</Form.Label>
                        <Form.Control type="text" className="part-1" placeholder="@example.com" />
                    </Form.Group>
                    <Form.Group controlId="exampleForm.ControlSelect1">
                        <Form.Label>College</Form.Label>
                        <Form.Control as="select">
                        <option>JKLU</option>
                        <option>others</option>
                        </Form.Control>
                    </Form.Group>
                    <Form.Group controlId="exampleForm.ControlInput1">
                        <Form.Label>Location</Form.Label>
                        <Form.Control type="text" className="part-1" placeholder="Jaipur/Delhi/Nodia" />
                    </Form.Group>
                    <Form.Group controlId="exampleForm.ControlInput1">
                        <Form.Label>Add users</Form.Label>
                        <Form.Control type="text" className="part-1 part-2" placeholder="Email/Github-ID" />
                        <Form.Control type="text" className="part-1 part-2" placeholder="Email/Github-ID" />
                        <Form.Control type="text" className="part-1 part-2" placeholder="Email/Github-ID" />
                        <Form.Control type="text" className="part-1 part-2" placeholder="Email/Github-ID" />
                        <Form.Control type="text" className="part-1 part-2" placeholder="Email/Github-ID" />
                        <Button  className="part-2" variant="primary" type="submit" >
                            Add more
                        </Button>
                    </Form.Group>
                    <Button  className="part-2 button" variant="primary" type="submit">
                        Submit
                    </Button>
                    
                    
                    </Form>
            </div>
            </div>
        );
    }

    appendinput(){
        return(
            <div>
                <Form.Group controlId="exampleForm.ControlInput1">
                    
                    <Form.Control type="text" className="part-1 part-2" placeholder="Email/Github-ID" />
                            
                </Form.Group>
            </div>
        );
        
    }
}

export default form;
