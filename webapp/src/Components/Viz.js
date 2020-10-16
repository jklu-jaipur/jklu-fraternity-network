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
                //console.log(displayData);
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
                friendNetworkSeries.minRadius = 30;
                friendNetworkSeries.maxRadius = 30;
                friendNetwork.zoomable = true;

                var icon = friendNetworkSeries.nodes.template.createChild(am4core.Image);
                icon.propertyFields.href = "avatar";
                icon.horizontalCenter = "middle";
                icon.verticalCenter = "middle";
                icon.width = 65;
                icon.height = 65;

                friendNetworkSeries.links.template.strokeWidth = 5;
                friendNetworkSeries.links.template.strokeOpacity = 1;
                friendNetworkSeries.links.template.distance = 3;

                friendNetworkSeries.nodes.template.tooltipText = "{name}{nameWithAvatar} ({githubId})\n Public Repo: [bold]{publicRepo}[/]";

                // friendNetworkSeries.nodes.template.circle.disabled = true;
                // friendNetworkSeries.nodes.template.outerCircle.disabled = true;
                this.chart = friendNetwork;

            });
    }

    componentWillUnmount() {
        //console.log('unmount');
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
