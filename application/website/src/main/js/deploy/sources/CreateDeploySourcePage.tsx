import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";
import "./DeploySources.css";
import CreateDeployJavaSourcePage from "./CreateDeployJavaSourcePage";
import {Select} from "antd";

const {Option} = Select;

type SourceType = "java"

type State = {
    source?: SourceType
}

const StateNames: { [key in SourceType]: string } = {
    java: "Java"
};

export default class CreateDeploySourcePage extends DeployBasePage<State> {

    constructor(props: any) {
        super(props);
        this.state = {source: "java"};
    }

    protected contentClass() {
        return "createDeploySource";
    }

    protected menuKey(): DeployMenuKey {
        return "createSource";
    }

    protected title() {
        return "Create Deployment Source";
    }

    protected body() {
        return <>

            <Select value={this.state.source} onChange={source => this.setState({source})}>
                {Object.entries(StateNames).map(kv => <Option key={kv[0]} value={kv[0]}>{kv[1]}</Option>)}
            </Select>

            {this.state.source == "java" && <div className="java"><CreateDeployJavaSourcePage/></div>}

        </>;
    }

}