import * as React from "react";
import * as ReactDOM from "react-dom";
import {HashRouter, Route} from "react-router-dom";
import Page from "../layout/Page";
import DeployDashboard from "./dashboard/DeployDashboard";
import DeploySourcesPage from "./sources/DeploySourcesPage";
import DeployTargetsPage from "./targets/DeployTargetsPage";

class DeployRouter extends React.PureComponent {

    render() {
        return <Page open="deploy">
            <HashRouter>
                <Route exact path="/" component={DeployDashboard}/>
                <Route path="/projects" component={DeployDashboard}/>
                <Route path="/sources" component={DeploySourcesPage}/>
                <Route path="/targets" component={DeployTargetsPage}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<DeployRouter/>, document.getElementById("main"));