import * as React from "react";
import {AsyncData} from "../../fetch/AsyncData";
import {Repository} from "../../../protobuf/repository_pb";
import {RepositoryCard} from "./RepositoryCard";

type Props = {
    repositories: AsyncData<ReadonlyArray<Repository.AsObject>>
}

export class RepositoriesList extends React.PureComponent<Props> {

    render() {

        return <div className="repositories">
            {this.renderInner()}
        </div>;

    }

    private renderInner() {

        const repositories = this.props.repositories;
        if (repositories.loading) return <Loading/>;
        if (repositories.error) return <Error error={repositories.error}/>;
        if (!repositories.data || !repositories.data.length) return <Empty/>;

        return <>{repositories.data.map(r => <RepositoryCard repository={r}/>)}</>;

    }

}

const Loading = (props: {}) => <>Loading repositories</>;

const Error = (props: {error: string}) => <div className="error">Error loading repositories: {props.error}</div>;

const Empty = (props: {}) => <div>No repositories have been configured yet.</div>;