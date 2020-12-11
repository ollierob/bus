import {MavenRepository, MavenRepositoryList} from "../../../protobuf/maven_pb";
import {protoGet} from "../../fetch/ProtoFetch";

export interface MavenLoader {

    loadAll(): Promise<ReadonlyArray<MavenRepository.AsObject>>;

    create(spec: MavenRepository.AsObject): Promise<MavenRepository.AsObject>;

    update(spec: MavenRepository.AsObject): Promise<MavenRepository.AsObject>;

    delete(id: string): Promise<MavenRepository.AsObject>

}

class ProtoMavenLoader implements MavenLoader {

    loadAll() {
        return protoGet("/deploy/repository/maven/get", MavenRepositoryList.deserializeBinary)
            .then(l => l ? l.getRepositoryList().map(r => r.toObject()) : []);
    }

    create(spec: MavenRepository.AsObject) {
        return this.update(spec);
    }

    update(spec: MavenRepository.AsObject) {
        return undefined;
    }

    delete(id: string) {
        return undefined;
    }

}

export const DEFAULT_MAVEN_LOADER: MavenLoader = new ProtoMavenLoader();