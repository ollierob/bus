import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";
import "./DeploySources.css";
import {Card} from "antd";

type SourceType = "maven"

type State = {
    sourceType?: SourceType
}

export default class CreateDeploySourcePage extends DeployBasePage<State> {

    constructor(props: any) {
        super(props);
        this.state = {};
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
            <SupportedSources onSelect={sourceType => this.setState({sourceType})}/>
            {this.state.sourceType == "maven" && <MavenSourceEditor/>}
        </>;
    }

}

const SupportedSources = (props: {onSelect: (type: SourceType) => void}) => {
    return <div className="sourceCards">
        <SupportedSource {...props} type="maven" title={<><img src="/img/maven.png"/> Maven Repository</>}>
            Deploy a pre-built JAR from a Maven repository.
        </SupportedSource>
    </div>;
};

const SupportedSource = (props: {type: SourceType, title: React.ReactNode, children?: React.ReactNode, onSelect: (type: SourceType) => void}) => {
    return <Card className={props.type} title={<a onClick={() => props.onSelect(props.type)}>{props.title}</a>} size="small">
        {props.children}
    </Card>;
};

const MavenSourceEditor = (props: {}) => {
    return <div className="maven">

    </div>;
};