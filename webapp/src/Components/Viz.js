import React, {Component} from 'react';
import "core-js/stable";
import "regenerator-runtime/runtime";
import * as am4core from "@amcharts/amcharts4/core";
import am4themes_animated from "@amcharts/amcharts4/themes/animated";
import * as am4plugins_forceDirected from "@amcharts/amcharts4/plugins/forceDirected";
import {ReadUsers} from "../util/FormDb";
import ProcessGraph from "../util/ProcessGraph";
import GraphProgress from "../BaseComponents/GraphProgress";

am4core.useTheme(am4themes_animated);


class viz extends Component {
    constructor(props) {
        super(props);
        this.state = {isReady: false};

    }

    componentDidMount() {
        ReadUsers()
            .then(data => ProcessGraph(data))
            .then(displayData => {
                this.setState({isReady: true});
                let friendNetwork = am4core.create("chartDiv", am4plugins_forceDirected.ForceDirectedTree);

                // Create series
                let friendNetworkSeries = friendNetwork.series.push(new am4plugins_forceDirected.ForceDirectedSeries());

                // Set data
                friendNetworkSeries.data = displayData;

                // Set up data fields
                friendNetworkSeries.dataFields.value = "value";
                friendNetworkSeries.dataFields.name = "name";
                friendNetworkSeries.dataFields.id = "githubId";
                friendNetworkSeries.dataFields.linkWith = "friends";

                // Add labels
                friendNetworkSeries.nodes.template.label.text = "{name}";
                friendNetworkSeries.fontSize = 10;
                friendNetworkSeries.minRadius = 15;
                friendNetworkSeries.maxRadius = 40;
                friendNetwork.zoomable = true;
                this.chart = friendNetwork;
            });


    }

    componentWillUnmount() {
        console.log('unmount');
        if (this.chart) {
            this.chart.dispose();
        }
    }

    render() {
        const ready = this.state.isReady;
        if (!ready) {
            return <GraphProgress/>
        }
        return (
            <div id="chartDiv" style={{width: "100vw", height: "100vh"}}/>
        );
    }
}


export default viz;
