import * as React from "react";
import {Repository} from "../../../protobuf/repository_pb";
import {MavenRepositoryEditor} from "./MavenRepositoryEditor";
import {DEFAULT_MAVEN_LOADER} from "../loader/MavenLoader";
import {AsyncData, asyncLoadData} from "../../fetch/AsyncData";
import {MavenRepository} from "../../../protobuf/maven_pb";

type Props = {
    repository: Repository.AsObject
}

type State = {
    save: AsyncData<Repository.AsObject>
}

export class RepositoryEditor extends React.PureComponent<Props, State> {

    private readonly mavenLoader = DEFAULT_MAVEN_LOADER;

    private saveMaven = (maven: MavenRepository.AsObject) => asyncLoadData(maven, this.mavenLoader.save, r => this.setState({save: r}));

    constructor(props: Props) {
        super(props);
        this.state = {save: {}};
    }

    render() {

        const repository = this.props.repository;
        if (!repository) return null;

        if (repository.maven) return <MavenRepositoryEditor maven={repository.maven} save={this.saveMaven} saving={this.state.save.loading}/>;

        return <Unsupported repository={repository}/>;

    }

}

const Unsupported = (props: {repository: Repository.AsObject}) => <div>Unsupported repository type</div>;

