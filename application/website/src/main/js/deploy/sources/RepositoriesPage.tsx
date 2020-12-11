import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";
import {Repository} from "../../../protobuf/repository_pb";
import {AsyncData, asyncLoadData} from "../../fetch/AsyncData";
import {DEFAULT_REPO_LOADER} from "../loader/RepositoryLoader";
import {RepositoriesList} from "./RepositoriesList";

type State = {
    repositories: AsyncData<ReadonlyArray<Repository.AsObject>>
}

export default class RepositoriesPage extends DeployBasePage<State> {

    private readonly repositoryLoader = DEFAULT_REPO_LOADER;

    constructor(props: any) {
        super(props);
        this.state = {repositories: {}};
    }

    protected menuKey(): DeployMenuKey {
        return "repositories";
    }

    protected title(): React.ReactNode {
        return "Repositories";
    }

    protected body() {
        return <>
            <RepositoriesList {...this.state}/>
        </>;
    }

    componentDidMount() {
        super.componentDidMount();
        asyncLoadData(null, () => this.repositoryLoader.loadAll(), repositories => this.setState({repositories}));
    }

}