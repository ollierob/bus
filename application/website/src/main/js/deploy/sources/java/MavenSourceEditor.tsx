import * as  React from "react";
import {Form, Input} from "antd";
import {FormProps} from "antd/es/form";
import {MavenArtifact} from "../../../../protobuf/maven_pb";

type Props = {
    artifact?: MavenArtifact.AsObject
}

type State = {
    artifact: MavenArtifact.AsObject
}

const FormLayout: FormProps = {
    labelCol: {span: 4},
    wrapperCol: {span: 6},
};

export class MavenSourceEditor extends React.PureComponent<Props, State> {

    constructor(props: Props) {
        super(props);
        this.state = {artifact: props.artifact || emptyArtifact()};
    }

    render() {

        return <>

            <div className="description">
                Download and deploy a single artifact from a Maven repository.
                The version used will be determined by the project.
            </div>

            <Form {...FormLayout}>

                <Form.Item label="Group ID">
                    <Input
                        required
                        placeholder="com.abc"
                        value={this.state.artifact.groupid}
                        onChange={e => this.update({groupid: e.target.value})}/>
                </Form.Item>

                <Form.Item label="Artifact ID">
                    <Input
                        required
                        placeholder="myArtifact"
                        value={this.state.artifact.artifactid}
                        onChange={e => this.update({artifactid: e.target.value})}/>
                </Form.Item>

                <Form.Item label="Classifier">
                    <Input
                        placeholder="Optional"
                        value={this.state.artifact.classifier}
                        onChange={e => this.update({classifier: e.target.value})}/>
                </Form.Item>

                <Form.Item label="Type">
                    <Input
                        placeholder="Optional"
                        value={this.state.artifact.type}
                        onChange={e => this.update({type: e.target.value})}/>
                </Form.Item>

            </Form>

        </>;

    }

    componentDidUpdate(prevProps: Readonly<Props>, prevState: Readonly<State>) {
        if (this.props.artifact != prevProps.artifact)
            this.setState({artifact: this.props.artifact || emptyArtifact()});
    }

    private update(update: Partial<MavenArtifact.AsObject>) {
        this.setState(curr => {
            const artifact: MavenArtifact.AsObject = {...curr.artifact, ...update};
            return {artifact};
        });
    }

}

function emptyArtifact(): MavenArtifact.AsObject {
    return {groupid: null, artifactid: null, classifier: null, type: null, version: null};
}