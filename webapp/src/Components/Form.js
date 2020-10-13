import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import { FormControl,Button } from '@material-ui/core';
import MenuItem from '@material-ui/core/MenuItem';
import ButtonGroup from '@material-ui/core/ButtonGroup';
import './Form.css';

const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
      width: '35ch',
      textAlign:'center'
    },
    
  },
}));

const colleges = [
    {
      value: 'JKLU',
      label: 'JK Lakshmipat University',
    },
    {
      value: 'Others',
      label: 'Others',
    },
];

export default function BasicTextFields() {
  const classes = useStyles();
  const [name,setname]=React.useState("");
  const [git,setgit]=React.useState("");
  const [city,setCity]=React.useState("");
  const [git1,setgit1]=React.useState("");
  const [git2,setgit2]=React.useState("");
  const [git3,setgit3]=React.useState("");
  const [git4,setgit4]=React.useState("");

    const [value, setValue]=React.useState('JK Lakshmipat University');

    const handleChange = (event) => {
        setValue(event.target.value);
    };
    const getName= (event)=>{
        setname(event.target.value);
    }
    const getGit=(event)=>{
        setgit(event.target.value);
    }
    const getCity=(event)=>{
        setCity(event.target.value);
    }
    const getGit1=(event)=>{
        setgit1(event.target.value);
    }
    const getGit2=(event)=>{
        setgit2(event.target.value);
    }
    const getGit3=(event)=>{
        setgit3(event.target.value);
    }
    const getGit4=(event)=>{
        setgit4(event.target.value);
    }
    const allValues=()=>{
        console.log(git,name,city,value,git1,git2,git3,git4)
    }

  return (
    <div>
        <div className="starter">
            <div>
                <form className="text"  >
                    <p>Registration</p>
            </form>
            </div>
            <div className="">
                <div className="form-style">
                    <div className="designform">
                        
                        <form className={classes.root}  >
                            <TextField   id="outlined-basic" label="GitHub Username" value={git} onChange={getGit} name="git" type="text" variant="outlined" />
                        </form>
                        <form className={classes.root}  >
                            <TextField   id="outlined-search" label="Name" value={name} onChange={getName} name="name" type="text" variant="outlined" />
                        </form>
                        <form className={classes.root}  >
                            <TextField  id="outlined-basic" label="City" value={city} onChange={getCity} name="city" type="text" variant="outlined" />
                        </form>
                        <form  className={classes.root} >
                            <TextField
                            id="standard-multiline-flexible"
                            name="college"
                            variant="outlined"
                            label="University/College"
                            value={value}
                            onChange={handleChange}
                            >
                            </TextField>
                        </form>
                    </div>  
                </div>
                
                <div className="designform">
                        <form className="subtext"  >
                            <p>Add Friends</p>
                        </form>
                        <form className={classes.root}  >
                            <TextField  id="outlined-basic" label="GitHub Username" value={git1} onChange={getGit1} name="city" type="text" variant="outlined" />
                        </form>
                        <form className={classes.root}  >
                            <TextField  id="outlined-basic" label="GitHub Username" value={git2} onChange={getGit2} name="city" type="text" variant="outlined" />
                        </form>
                        <form className={classes.root}  >
                            <TextField  id="outlined-basic" label="GitHub Username" value={git3} onChange={getGit3} name="city" type="text" variant="outlined" />
                        </form>
                        <form className={classes.root}  >
                            <TextField  id="outlined-basic" label="GitHub Username" value={git4} onChange={getGit4} name="city" type="text" variant="outlined" />
                        </form>
                            <div className="">
                                <Button variant="contained" color="primary" onClick={allValues}>SUBMIT</Button>
                                <Button ></Button>
                                <Button variant="contained" color="primary" >CLEAR</Button>                                
                            </div>                        
                    </div>  
                </div>
            </div>
        </div>
    
  );
}