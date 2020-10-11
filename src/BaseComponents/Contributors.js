import React from 'react';
import './Contributors.css';
import {Card,Form,Button} from 'react-bootstrap';
import logo from './download.png';

class Contributors extends React.Component {
    render() {
        return(
            /*<div>
                <div className="headname">
                    <Form>
                        <p>Designed by</p>
                        
                    </Form>
                </div>
                <div className="parter headname">
                    <div className="partter-1">
                        <p>Shubham Bhandari</p>
                        <p>JKLU</p>
                        <div className="button-1">
                            <Button href="#" className="button-2" variant="success">Linkedin</Button>{' '}
                        </div>
                    </div>
                    <div className="partter-1">
                        <p>Harsh Udai</p>
                        <p>JKLU</p>
                        <div className="button-1">
                            <Button href="#" className="button-2" variant="success">Linkedin</Button>{' '}
                        </div>
                    </div>
                    <div className="partter-1">
                        <p>Samyak Bhagat</p>
                        <p>JKLU</p>
                        <div className="button-1">
                            <Button href="#" className="button-2" variant="success">Linkedin</Button>{' '}
                        </div>
                    </div>
                 </div>
                
            </div>*/
            <div>
            <div className="headname">
                    <Form>
                        <p>Designed by</p>
                        
                    </Form>
            </div>
            <div className="headName">
                
                <div className="partter-1">
                <Card style={{ width: '18rem' }}>
                    <Card.Img variant="top" src={logo} />
                    <Card.Body>
                        <Card.Title>Alok Kumar</Card.Title>
                        <Card.Text>
                        CSE- Faculty
                        JKLU
                        </Card.Text>
                        <Button variant="primary">Linkedin</Button>
                    </Card.Body>
                </Card>
                </div>
                <div className="partter-1">
                <Card style={{ width: '18rem' }}>
                    <Card.Img variant="top" src={logo} />
                    <Card.Body>
                        <Card.Title>Shubham Bhandari</Card.Title>
                        <Card.Text>
                        CSE- Student (IV year)
                        JKLU
                        </Card.Text>
                        <Button variant="primary">Linkedin</Button>
                    </Card.Body>
                </Card>
                </div>
                <div className="partter-1">
                <Card style={{ width: '18rem' }}>
                    <Card.Img variant="top" src={logo} />
                    <Card.Body>
                        <Card.Title>Harsh Udai</Card.Title>
                        <Card.Text>
                        CSE- Student (III year)
                        JKLU
                        </Card.Text>
                        <Button variant="primary">Linkedin</Button>
                    </Card.Body>
                </Card>
                </div>
                <div className="partter-1">
                <Card style={{ width: '18rem' }}>
                    <Card.Img variant="top" src={logo} />
                    <Card.Body>
                        <Card.Title>Samyak Bhagat</Card.Title>
                        <Card.Text>
                        CSE- Student (III year)
                        JKLU
                        </Card.Text>
                        <Button variant="primary">Linkedin</Button>
                    </Card.Body>
                </Card>
                </div>
            </div>
            </div>
        );
    }
}

export default Contributors;
