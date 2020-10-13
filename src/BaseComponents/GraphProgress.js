import CircularProgress from "@material-ui/core/CircularProgress";
import React from 'react';
import './GraphProgress.css';
export default function GraphProgress() {
    return (
        <CircularProgress className="centered" disableShrink/>
    );
}
