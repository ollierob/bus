import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";
import {Repository} from "../../../protobuf/repository_pb";
import {AsyncData, asyncLoadData} from "../../fetch/AsyncData";
import {DEFAULT_REPO_LOADER} from "../loader/RepositoryLoader";
import {RepositoriesList} from "./RepositoriesList";
import {Button, Cascader} from "antd";
import {RepositoryEditor} from "./RepositoryEditor";
import {CascaderOptionType} from "antd/lib/cascader";
import {EmptyMavenCentralRepo, EmptyNexusRepo} from "./Repository";

type State = {
    mode: "list" | "create" | "edit";
    repositories: AsyncData<ReadonlyArray<Repository.AsObject>>
    repository: Repository.AsObject;
}

export default class RepositoriesPage extends DeployBasePage<State> {

    private readonly repositoryLoader = DEFAULT_REPO_LOADER;

    constructor(props: any) {
        super(props);
        this.state = {
            mode: "list",
            repository: null,
            repositories: {},
        };
    }

    protected menuKey(): DeployMenuKey {
        return "repositories";
    }

    protected title(): React.ReactNode {
        return "Repositories";
    }

    protected body() {

        return <div className="repositories">

            {this.state.mode == "list" && <>
                <CreateRepository onClick={() => this.setState({mode: "create"})}/>
                <RepositoriesList {...this.state}/>
            </>}

            {this.state.mode == "create" && <>
                <CreateRepositoryControls init={repository => this.setState({repository})}/>
                <RepositoryEditor {...this.state}/>
            </>}

            {this.state.mode == "edit" && <>
                <EditRepositoryControls/>
                <RepositoryEditor {...this.state}/>
            </>}

        </div>;

    }

    componentDidMount() {
        super.componentDidMount();
        asyncLoadData(null, () => this.repositoryLoader.loadAll(), repositories => this.setState({repositories}));
    }

}

const CreateRepository = (props: {onClick: () => void}) => <Button size="large" className="create button" onClick={props.onClick}>Create repository</Button>;

type RepositoryType = "nexus3" | "mavenCentral";

const CreateRepositoryControls = (props: {init: (repository: Repository.AsObject) => void}) => {
    return <div className="create controls">
        Choose a repository type:
        <Cascader
            className="selector"
            size="large"
            placeholder={null}
            options={RepoOptions}
            onChange={(v, o) => o.length == 2 && props.init(o[1].stub)}/>
    </div>;
};

const RepoOptions: CascaderOptionType[] = [
    {
        label: "Maven", value: "maven", children: [
            {label: "Maven Central", value: "mavenCentral", isLeaf: true, stub: EmptyMavenCentralRepo},
            {label: "Nexus 3", value: "nexus3", stub: EmptyNexusRepo}
        ]
    }
];

const EditRepositoryControls = (props: {}) => {
    return <div className="edit">

    </div>;
};