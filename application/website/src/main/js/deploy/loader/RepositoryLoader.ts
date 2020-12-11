import {Repository, RepositoryList} from "../../../protobuf/repository_pb";
import {protoGet} from "../../fetch/ProtoFetch";
import {MavenRepository} from "../../../protobuf/maven_pb";
import {DEFAULT_MAVEN_LOADER, MavenLoader} from "./MavenLoader";

export interface RepositoryLoader {

    loadAll(): Promise<ReadonlyArray<Repository.AsObject>>

    loadAllMaven(): Promise<ReadonlyArray<MavenRepository.AsObject>>

}

class ProtoRepositoryLoader implements RepositoryLoader {

    private readonly maven: MavenLoader;

    constructor(maven: MavenLoader) {
        this.maven = maven;
    }

    loadAll() {
        return protoGet("/deploy/repository/get", RepositoryList.deserializeBinary)
            .then(l => l ? l.getRepositoryList().map(r => r.toObject()) : []);
    }

    loadAllMaven() {
        return this.maven.loadAll();
    }

}

export const DEFAULT_REPO_LOADER: RepositoryLoader = new ProtoRepositoryLoader(DEFAULT_MAVEN_LOADER);