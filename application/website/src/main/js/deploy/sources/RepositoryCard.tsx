import * as  React from "react";
import {Repository} from "../../../protobuf/repository_pb";
import {MavenRepository} from "../../../protobuf/maven_pb";

export const RepositoryCard = (props: {repository: Repository.AsObject}) => {
    const repository = props.repository;
    if (repository.maven) return <MavenRepositoryCard repository={repository.maven}/>;
    return null;
};

const MavenRepositoryCard = (props: {repository: MavenRepository.AsObject}) => {
    return <div className="repository">
    </div>;
};