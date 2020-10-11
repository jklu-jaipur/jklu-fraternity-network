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
                    <ContributorCard name='Dr.Alok Kumar' about='Faculty'/>
                </div>
            </div>
        );
    }
}

export default Contributors;
