import * as React from "react";
import * as ReactDOM from "react-dom";
import {HashRouter, Route} from "react-router-dom";
import Page from "../layout/Page";
import ManageMainPage from "./ManageMainPage";

class ManageRouter extends React.PureComponent {

    render() {
        return <Page open="manage">
            <HashRouter>
                <Route exact path="/" component={ManageMainPage}/>
            </HashRouter>
        </Page>;
    }

}

ReactDOM.render(<ManageRouter/>, document.getElementById("main"));