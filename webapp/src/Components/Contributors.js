import React from 'react';
import ContributorCard from "../BaseComponents/ContributorCard";

class Contributors extends React.Component {
    render() {
        return (
            <div>
                <div className="headname">
                    <div>
                        <p>Designed by</p>
                    </div>
                </div>
                <div className="headName">
                    <ContributorCard name='Dr.Alok Kumar' about='Faculty CSE'/>
                    <ContributorCard name='Shubham Bhandari' about='IV Year CSE'/>
                    <ContributorCard name='Harsh Udai' about='III Year CSE'/>
                    <ContributorCard name='Samyak Bhagat' about='III Year CSE'/>
                </div>
            </div>
        );
    }
}

export default Contributors;
