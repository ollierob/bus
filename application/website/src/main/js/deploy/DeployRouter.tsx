import * as React from "react";
import * as ReactDOM from "react-dom";
import {HashRouter, Route} from "react-router-dom";
import Page from "../layout/Page";
import DeployProjectsPage from "./projects/DeployProjectsPage";
import DeploySourcesPage from "./sources/DeploySourcesPage";
import DeployTargetsPage from "./targets/DeployTargetsPage";
import "./Deploy.css";

class DeployRouter extends React.PureComponent {

    render() {
        return <Page open="deploy">
            <HashRouter>
                <Route exact path="/" component={DeployProjectsPage}/>
                <Route path="/projects" component={DeployProjectsPage}/>
                <Route path="/sources" component={DeploySourcesPage}/>
                <Route path="/targets" component={DeployTargetsPage}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<DeployRouter/>, document.getElementById("main"));