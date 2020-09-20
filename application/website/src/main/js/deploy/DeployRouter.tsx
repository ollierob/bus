import * as React from "react";
import * as ReactDOM from "react-dom";
import {HashRouter, Route} from "react-router-dom";
import Page from "../layout/Page";
import DeployDashboard from "./dashboard/DeployDashboard";

class DeployRouter extends React.PureComponent {

    render() {
        return <Page open="deploy">
            <HashRouter>
                <Route exact path="/" component={DeployDashboard}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<DeployRouter/>, document.getElementById("main"));