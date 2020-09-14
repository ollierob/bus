import * as React from "react";
import * as ReactDOM from "react-dom";
import {HashRouter, Route} from "react-router-dom";
import Page from "../layout/Page";
import DeployMainPage from "./DeployMainPage";

class DeployRouter extends React.PureComponent {

    render() {
        return <Page open="deploy">
            <HashRouter>
                <Route exact path="/" component={DeployMainPage}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<DeployRouter/>, document.getElementById("main"));