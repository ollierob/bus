import * as React from "react";
import * as ReactDOM from "react-dom";
import {HashRouter, Route} from "react-router-dom";
import Page from "../layout/Page";
import "./Deploy.css";
import DeployProjectsPage from "./projects/DeployProjectsPage";
import ListDeploySourcesPage from "./sources/ListDeploySourcesPage";
import DeployTargetsPage from "./targets/DeployTargetsPage";
import CreateDeploySourcePage from "./sources/DeploySourceCreatePage";

class DeployRouter extends React.PureComponent {

    render() {
        return <Page open="deploy">
            <HashRouter>
                <Route exact path="/" component={DeployProjectsPage}/>
                <Route path="/projects" component={DeployProjectsPage}/>
                <Route path="/sources" component={ListDeploySourcesPage}/>
                <Route path="/createSource" component={CreateDeploySourcePage}/>
                <Route path="/targets" component={DeployTargetsPage}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<DeployRouter/>, document.getElementById("main"));