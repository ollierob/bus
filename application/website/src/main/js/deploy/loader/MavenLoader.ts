import {MavenCentral, MavenRepository, MavenRepositoryList, Nexus3Repository} from "../../../protobuf/maven_pb";
import {protoGet, protoPost} from "../../fetch/ProtoFetch";

export interface MavenLoader {

    loadAll(): Promise<ReadonlyArray<MavenRepository.AsObject>>;

    save(spec: MavenRepository.AsObject): Promise<MavenRepository.AsObject>;

    delete(id: string): Promise<MavenRepository.AsObject>

}

class ProtoMavenLoader implements MavenLoader {

    loadAll() {
        return protoGet("/deploy/repository/maven/get", MavenRepositoryList.deserializeBinary)
            .then(l => l ? l.getRepositoryList().map(r => r.toObject()) : []);
    }

    save(spec: MavenRepository.AsObject) {
        return protoPost("/deploy/repository/maven/save", toProto(spec), MavenRepository.serializeBinaryToWriter, MavenRepository.deserializeBinary)
            .then(r => r ? r.toObject() : null);
    }

    delete(id: string) {
        return undefined;
    }

}

export const DEFAULT_MAVEN_LOADER: MavenLoader = new ProtoMavenLoader();

function toProto(spec: MavenRepository.AsObject): MavenRepository {
    const proto = new MavenRepository();
    if (spec.id) proto.setId(spec.id);
    if (spec.version) proto.setVersion(spec.version);
    if (spec.nexus3) {
        const nexus = new Nexus3Repository();
        nexus.setUsername(spec.nexus3.username);
        nexus.setPassword(spec.nexus3.password);
        nexus.setUrl(spec.nexus3.url);
        proto.setNexus3(nexus);
    } else if (spec.central) {
        const central = new MavenCentral();
        central.setUrl(spec.central.url);
        proto.setCentral(central);
    }
    return proto;
}