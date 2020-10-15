import React from 'react';
import ContributorCard from "../BaseComponents/ContributorCard";
import Paper from '@material-ui/core/Paper';

import './Contributors.css';

class Contributors extends React.Component {
    render() {
        return (
            <div>
                <Paper elevation={10}>
                    <div className="headname">
                        <div className="text-head">
                            <p>Designed & Developed by</p>
                        </div>

                    </div>
                </Paper>
                <div className="headName">
                    <ContributorCard name='Dr.Alok Kumar' about='Faculty Coordinator'
                                     linkedin='https://www.linkedin.com/in/alok-kumar-b8845aa2/'
                                     github='https://github.com/dralokkumar'
                                     img={0}/>
                    <ContributorCard name='Shubham Bhandari' about='Designer & Developer'
                                     linkedin='https://www.linkedin.com/in/this-is-sb/'
                                     github='https://github.com/dev-SB'
                                     img={1}/>
                    <ContributorCard name='Harsh Udai' about='Designer & Developer'
                                     linkedin='https://www.linkedin.com/in/harsh-udai-6b4189182/'
                                     github='https://github.com/HarshUdai'
                                     img={2}/>
                    <ContributorCard name='Samyak Bhagat' about='Designer & Developer'
                                     linkedin='https://www.linkedin.com/in/samyak-bhagat-b3398473/'
                                     github='https://github.com/samyak-bhagat'
                                     img={3}/>
                </div>
            </div>
        );
    }
}

export default Contributors;
