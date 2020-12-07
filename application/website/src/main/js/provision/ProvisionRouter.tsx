import * as React from "react";
import * as ReactDOM from "react-dom";
import Page from "../layout/Page";
import {HashRouter, Route} from "react-router-dom";
import ProvisionMainPage from "./ProvisionMainPage";

class ProvisionRouter extends React.PureComponent {

    render() {
        return <Page open="provision">
            <HashRouter>
                <Route exact path="/" component={ProvisionMainPage}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<ProvisionRouter/>, document.getElementById("main"));