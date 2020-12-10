import React from "react";
import {Card} from "antd";

type SourceType = "maven" | "gitlab" | "github"

type Props = {}

type State = {
    type?: SourceType
}

export default class CreateDeployJavaSourcePage extends React.PureComponent<Props, State> {

    constructor(props: Props) {
        super(props);
        this.state = {};
    }

    render() {

        return <>
            <SupportedSources onSelect={type => this.setState({type})}/>
            {this.state.type == "maven" && <MavenSourceEditor/>}
        </>;

    }

}

const SupportedSources = (props: {onSelect: (type: SourceType) => void}) => {
    return <div className="sourceCards">
        <SupportedSource {...props} type="maven" title={<><img src="/img/maven.png"/> Maven Repository</>}>
            Deploy a pre-built JAR from a Maven repository.
        </SupportedSource>
        <SupportedSource {...props} type="github" title={<><img src="/img/github.png"/> Github</>}>
            Trigger a Github build.
        </SupportedSource>
        <SupportedSource {...props} type="gitlab" title={<><img src="/img/gitlab.png"/> Gitlab</>}>
            Trigger a Gitlab build.
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