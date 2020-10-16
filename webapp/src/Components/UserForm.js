import React from 'react';

import TextField from '@material-ui/core/TextField';
import {Button} from '@material-ui/core';
import FormValidation from "../util/FormValidation";
import './UserForm.css';
import Paper from "@material-ui/core/Paper";
import SubmitButtonProgress from "../BaseComponents/SubmitButtonProgress";
import SubmitButtonSnackbar from "../BaseComponents/SubmitButtonSnackbar";


class UserForm extends React.Component {
    initialState = {
        redirectUrl: 'https://github.com/jklu-jaipur/jklu-fraternity-network/',
        gitId: '',
        name: '',
        city: '',
        clg: 'JK Lakshmipat University',
        git1: '',
        git2: '',
        git3: '',
        git4: '',
        gitIdError: false,
        cityError: false,
        clgError: false,
        nameError: false,
        git1Error: false,
        git2Error: false,
        git3Error: false,
        git4Error: false,
        gitIdErrorMsg: 'Enter your Github id.',
        cityErrorMsg: 'Enter you home city/town.',
        clgErrorMsg: 'Enter your college/university.',
        nameErrorMsg: 'Enter your full name.',
        git1ErrorMsg: 'Enter your friend\'s github id.',
        git2ErrorMsg: 'Enter your friend\'s github id.',
        git3ErrorMsg: 'Enter your friend\'s github id.',
        git4ErrorMsg: 'Enter your friend\'s github id.',
        progress: false,

    };
    initialSnackbar = {
        openSnackbar: false,
        severity: undefined,
        msg: undefined
    };

    constructor(props) {
        super(props);
        this.state = {...this.initialState, ...this.initialSnackbar};
    }

    checkName(string) {
        if (string.length >= 3) {
            if (RegExp('^([a-zA-Z\\s\\.\\)\\(]+)$').test(string)) {
                return {msg: 'Enter your full name.', error: false};
            } else {
                return {msg: 'Special Char and numbers are not permitted.', error: true};
            }
        } else {
            return {msg: 'Enter string longer than 3 characters.', error: true};
        }
    }

    checkCityClg(string, clg) {
        if (string.trim().length === 0) {
            if (clg) {
                return {msg: 'Enter your college/university.', error: false};
            }
            return {msg: 'Enter you home city/town.', error: false};
        }
        if (string.trim().length >= 3) {
            if (RegExp('^([a-zA-Z\\s\\.\\)\\(]+)$').test(string)) {
                if (clg) {
                    return {msg: 'Enter your college/university.', error: false};
                }
                return {msg: 'Enter you home city/town.', error: false};
            } else {
                return {msg: 'Special Char and numbers are not permitted.', error: true};
            }
        }
        if (0 < string.trim().length && string.trim().length < 3) {
            return {msg: 'Enter string longer than 3 characters.', error: true};
        }
    }

    checkCompulsoryGithubId(string, user) {
        if (string.length >= 3) {
            if (RegExp('(^[a-zA-Z0-9][a-zA-Z0-9\\-]+[a-zA-Z0-9])$').test(string)) {
                if (user) {
                    return {msg: 'Enter your Github id.', error: false};
                } else {

                    return {msg: 'Enter your friend\'s github id.', error: false};
                }

            } else {
                return {msg: 'Github id has alphanumeric char and -.', error: true};
            }
        } else {
            return {msg: 'Github id is longer than 3 characters.', error: true};
        }
    }

    checkOtherGithubId(string) {
        if (string.trim().length === 0) {
            return {msg: undefined, error: false};
        }
        if (string.trim().length >= 3) {
            if (RegExp('(^[a-zA-Z0-9][a-zA-Z0-9\\-]+[a-zA-Z0-9])$').test(string)) {
                return {msg: 'Enter your friend\'s github id.', error: false};
            } else {
                return {msg: 'Github id has alphanumeric char and -.', error: true};
            }
        }
        if (0 < string.trim().length && string.trim().length < 4) {
            return {msg: 'Github id is longer than 3 characters.', error: true};
        }
    }

    handleGitIdChange = event => {
        this.setState({gitId: event.target.value}, () => {
            this.validateGitId();
        });
    };
    validateGitId = () => {
        const {gitId} = this.state;
        let {msg, error} = this.checkCompulsoryGithubId(gitId, true);
        this.setState({
            gitIdErrorMsg: msg,
            gitIdError: error
        });
    };
    handleNameChange = event => {
        this.setState({name: event.target.value}, () => {
            this.validateName();
        });
    };
    validateName = () => {
        const {name} = this.state;
        let {msg, error} = this.checkName(name);
        //console.log('name', msg, error);
        this.setState({
            nameErrorMsg: msg,
            nameError: error
        });
    };

    handleCityChange = event => {
        this.setState({city: event.target.value}, () => {
            this.validateCity();
        });
    };
    validateCity = () => {
        const {city} = this.state;
        let {msg, error} = this.checkCityClg(city, false);
        //console.log('city', msg, error);
        this.setState({
            cityErrorMsg: msg,
            cityError: error
        });
    };
    handleClgChange = event => {
        this.setState({clg: event.target.value}, () => {
            this.validateClg();
        });
    };
    validateClg = () => {
        const {clg} = this.state;
        let {msg, error} = this.checkCityClg(clg, true);
        this.setState({
            clgErrorMsg: msg,
            clgError: error
        });
    };
    handleGit1Error = event => {
        this.setState({git1: event.target.value}, () => {
            this.validateGit1();
        });
    };
    validateGit1 = () => {
        const {git1} = this.state;
        let {msg, error} = this.checkCompulsoryGithubId(git1, false);
        this.setState({
            git1ErrorMsg: msg,
            git1Error: error
        });
    };
    handleGit2Error = event => {
        this.setState({git2: event.target.value}, () => {
            this.validateGit2();
        });
    };
    validateGit2 = () => {
        const {git2} = this.state;
        let {msg, error} = this.checkCompulsoryGithubId(git2, false);
        this.setState({
            git2ErrorMsg: msg,
            git2Error: error
        });
    };
    handleGit3Error = event => {
        this.setState({git3: event.target.value}, () => {
            this.validateGit3();
        });
    };
    validateGit3 = () => {
        const {git3} = this.state;
        let {msg, error} = this.checkOtherGithubId(git3);
        this.setState({
            git3ErrorMsg: msg,
            git3Error: error
        });
    };
    handleGit4Error = event => {
        this.setState({git4: event.target.value}, () => {
            this.validateGit4();
        });
    };
    validateGit4 = () => {
        const {git4} = this.state;
        let {msg, error} = this.checkOtherGithubId(git4);
        this.setState({
            git4ErrorMsg: msg,
            git4Error: error
        });
    };


    checkErrors() {
        return !(!this.state.nameError && !this.state.gitIdError && !this.state.git1Error && !this.state.git2Error
            && this.state.name.trim() !== '' && this.state.gitId !== '' && this.state.git1 !== '' && this.state.git2 !== '');
    }

    handleSubmit = event => {
        event.preventDefault();
        const {name, gitId, clg, city, git1, git2, git3, git4} = this.state;
        if (!this.checkErrors()) {
            console.log(this.state);
            this.setState({progress: true});
            FormValidation(gitId.trim().toLowerCase(), clg.trim(), git1.trim().toLowerCase(),
                git2.trim().toLowerCase(), git3.trim().toLowerCase(), git4.trim().toLowerCase(), city.trim(),
                name.trim())
                .then(res => {
                    console.log(this.state);
                    if (res === false) {
                        this.setState({
                            progress: false,
                            openSnackbar: true,
                            severity: 'error',
                            msg: 'Please enter correct details.'
                        });
                        this.clearSnackbar(false);
                    } else {
                        console.log(this.state);
                        this.setState({
                            progress: false,
                            openSnackbar: true,
                            severity: 'success',
                            msg: 'Data Saved Successfully. You will now be redirected to repo.'
                        });

                        this.clearSnackbar(true);
                        this.clearAll();
                    }
                    //console.log(res);
                }).catch(err => {
                console.log(this.state);
                this.setState({
                    progress: false,
                    openSnackbar: true,
                    severity: 'error',
                    msg: 'Please correctly fill required fields.'
                });
                this.clearAll();
                this.clearSnackbar(false)
                //console.log('error');
                //console.log(err);
            });
        } else {
            console.log(this.state);
            this.setState({
                progress: false,
                openSnackbar: true,
                severity: 'error',
                msg: 'Please correctly fill required fields.'
            });
            this.clearSnackbar(false);
        }
    };

    redirectToRepo = () => {
        window.open(
            this.state.redirectUrl, "_blank");
    };
    clearAll = event => {
        // event.preventDefault();
        this.setState(this.initialState);
    };

    clearSnackbar(redirect) {
        console.log(this.state);
        setTimeout(() => {
            console.log(this.state);
            this.setState({
                openSnackbar: false,
                severity: 'error',
                msg: undefined
            });
            if (redirect) {
                this.redirectToRepo();
                // console.log('redirect');
                window.location.reload();
            }
        }, 3000);

    }

    render() {
        return (
            <div>
                <SubmitButtonProgress visible={this.state.progress}/>
                <SubmitButtonSnackbar openSnackbar={this.state.openSnackbar} severity={this.state.severity}
                                      msg={this.state.msg}/>
                <div className="starter">
                    <div>
                        <Paper elevation={7} className="paper-respo-1">
                            <form className="text">
                                <p className="register-text">Registration</p>
                            </form>
                        </Paper>
                    </div>
                    <div className="align-part1">
                        <div className="form-style">

                            <div className="designform">

                                <form className={["textarea-1", "subtext tf-comp"].join(' ')}>
                                    <p>Details</p>
                                </form>
                                <form className={'tf-comp'}>
                                    <TextField className="textarea-1" required id="outlined-gitId" autoFocus={true}
                                               label="GitHub Username"
                                               value={this.state.gitId}
                                               error={this.state.gitIdError} onChange={this.handleGitIdChange}
                                               name="git"
                                               type="text"
                                               helperText={this.state.gitIdErrorMsg}
                                               variant="outlined"/>
                                </form>
                                <form className={'tf-comp'}>
                                    <TextField className="textarea-1" required id="outlined-name" label="Name"
                                               value={this.state.name}
                                               onChange={this.handleNameChange}
                                               error={this.state.nameError} name="name" type="text" variant="outlined"
                                               helperText={this.state.nameErrorMsg}/>
                                </form>
                                <form className={'tf-comp'}>
                                    <TextField className="textarea-1" id="outlined-city" label="City"
                                               value={this.state.city}
                                               onChange={this.handleCityChange}
                                               name="city"
                                               error={this.state.cityError} helperText={this.state.cityErrorMsg}
                                               type="text"
                                               variant="outlined"/>
                                </form>
                                <form className={'tf-comp'}>
                                    <TextField
                                        id="outlined-clg"
                                        className="textarea-1"
                                        name="college"
                                        variant="outlined"
                                        label="University/College"
                                        value={this.state.clg}
                                        error={this.state.clgError}
                                        onChange={this.handleClgChange}
                                        helperText={this.state.clgErrorMsg}
                                    >
                                    </TextField>
                                </form>

                            </div>

                            <div className="designform">

                                <form className={["textarea-1", "subtext tf-comp"].join(' ')}>
                                    <p>Add Friends</p>
                                </form>
                                <form className={["textarea-1", 'tf-comp'].join(' ')}>
                                    <TextField className="textarea-1" required id="outlined-git1"
                                               label="GitHub Username" value={this.state.git1}
                                               error={this.state.git1Error} onChange={this.handleGit1Error} name="git1"
                                               type="text"
                                               helperText={this.state.git1ErrorMsg}

                                               variant="outlined"/>
                                </form>
                                <form className={["textarea-1", 'tf-comp'].join(' ')}>
                                    <TextField className="textarea-1" required id="outlined-git2"
                                               label="GitHub Username" value={this.state.git2}
                                               error={this.state.git2Error} onChange={this.handleGit2Error} name="git2"
                                               type="text"
                                               helperText={this.state.git2ErrorMsg}
                                               variant="outlined"/>
                                </form>
                                <form className={["textarea-1", 'tf-comp'].join(' ')}>
                                    <TextField className="textarea-1" id="outlined-git3" label="GitHub Username"
                                               value={this.state.git3}
                                               onChange={this.handleGit3Error}
                                               helperText={this.state.git3ErrorMsg}
                                               error={this.state.git3Error}
                                               name="git3" type="text" variant="outlined"/>
                                </form>
                                <form className={["textarea-1", 'tf-comp'].join(' ')}>
                                    <TextField className="textarea-1" id="outlined-git4" label="GitHub Username"
                                               value={this.state.git4}
                                               onChange={this.handleGit4Error} error={this.state.git4Error}
                                               helperText={this.state.git4ErrorMsg}
                                               name="git4" type="text" variant="outlined"/>
                                </form>
                                <div className="Button-align designform">
                                    <div className="button-adjust">
                                        <Button className="button1" color="primary" variant="contained"
                                                onClick={this.handleSubmit}>SUBMIT</Button>

                                        <Button className="button2" variant="contained" color="secondary"
                                                onClick={this.clearAll}>CLEAR</Button>
                                    </div>
                                </div>

                            </div>

                        </div>

                    </div>
                </div>
            </div>
        );
    }
}

export default UserForm;
