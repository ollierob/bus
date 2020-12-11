import {Repository, RepositoryList} from "../../../protobuf/repository_pb";
import {protoGet} from "../../fetch/ProtoFetch";

export interface RepositoryLoader {

    loadAll(): Promise<ReadonlyArray<Repository.AsObject>>

}

class ProtoRepositoryLoader implements RepositoryLoader {

    loadAll() {
        return protoGet("/deploy/repository/get", RepositoryList.deserializeBinary)
            .then(l => l ? l.getRepositoryList().map(r => r.toObject()) : []);
    }

}

export const DEFAULT_REPO_LOADER: RepositoryLoader = new ProtoRepositoryLoader();