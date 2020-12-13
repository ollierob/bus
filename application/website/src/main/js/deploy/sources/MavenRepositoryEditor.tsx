import * as React from "react";
import {MavenRepository} from "../../../protobuf/maven_pb";
import {Button, Col, Input, Row} from "antd";

type Props = {
    maven: MavenRepository.AsObject;
    save: (repo: MavenRepository.AsObject) => void;
    saving: boolean;
}

type State = {
    maven: MavenRepository.AsObject;
}

export class MavenRepositoryEditor extends React.PureComponent<Props, State> {

    constructor(props: Props) {
        super(props);
        this.state = {maven: {...props.maven}};
    }

    render() {

        const maven = this.state.maven;

        return <>

            <div className="maven">

                <Row>
                    <Col span={2}>
                        ID:
                    </Col>
                    <Col span={8}>
                        <Input value={maven.id}/>
                    </Col>
                </Row>

                {maven.central && <Row>
                    <Col span={2}>
                        URL:
                    </Col>
                    <Col span={8}>
                        <Input
                            placeholder="https://search.maven.org"
                            value={maven.central.url}
                            onChange={v => this.updateCentral(v.target.value)}/>
                    </Col>
                </Row>}

                <Row>
                    <Col span={2}/>
                    <Col span={8}>
                        <Button loading={this.props.saving} size="large" onClick={() => this.props.save(this.state.maven)}>
                            Save
                        </Button>
                    </Col>
                </Row>

            </div>

        </>;

    }

    componentDidUpdate(prevProps: Readonly<Props>, prevState: Readonly<State>) {
        if (this.props.maven != prevProps.maven)
            this.setState({maven: {...this.props.maven}});
    }

    private updateCentral(url: string) {
        this.setState(current => {
            const maven: MavenRepository.AsObject = {...current.maven};
            if (maven.central) maven.central.url = url;
            else maven.central = {url: url};
            return {maven};
        });
    }

}