import * as React from "react";
import * as ReactDOM from "react-dom";
import {HashRouter, Route} from "react-router-dom";
import Page from "../layout/Page";
import "./Deploy.css";
import CreateDeployProjectPage from "./projects/CreateDeployProjectPage";
import DeployProjectsPage from "./projects/DeployProjectsPage";
import DeploySourcesPage from "./sources/DeploySourcesPage";
import RepositoriesPage from "./sources/RepositoriesPage";
import DeployTargetsPage from "./targets/DeployTargetsPage";
import BuildServersPage from "./sources/BuildServersPage";

class DeployRouter extends React.PureComponent {

    render() {
        return <Page open="deploy">
            <HashRouter>
                <Route exact path="/" component={DeployProjectsPage}/>
                <Route path="/projects" component={DeployProjectsPage}/>
                <Route path="/createProject" component={CreateDeployProjectPage}/>
                <Route path="/sources" component={DeploySourcesPage}/>
                <Route path="/repositories" component={RepositoriesPage}/>
                <Route path="/buildServers" component={BuildServersPage}/>
                <Route path="/targets" component={DeployTargetsPage}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<DeployRouter/>, document.getElementById("main"));