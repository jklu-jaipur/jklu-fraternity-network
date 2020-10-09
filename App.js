import React, {Component} from 'react';
import './App.css';
import Navbar from './navbar.js';
import 'bootstrap/dist/css/bootstrap.min.css';
import Content from './Content.js';
import Viz from './viz.js';
import Form from './form.js'

function App(){
  return(
    <div>
      <Navbar />
      <Content />
      <Viz />
      <Form />
    </div>
  );
}

export default App;
