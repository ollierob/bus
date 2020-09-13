import * as React from "react";
import * as ReactDOM from "react-dom";
import Page from "../layout/Page";

class DeployRouter extends React.PureComponent {

    render() {
        return <Page open="deploy">

        </Page>;
    }

}

ReactDOM.render(<DeployRouter/>, document.getElementById("main"));