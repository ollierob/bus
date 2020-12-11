import {AsyncData} from "../../fetch/AsyncData";
import {MavenRepository} from "../../../protobuf/maven_pb";

export interface MavenLoader {

    loadAll(): AsyncData<ReadonlyArray<MavenRepository.AsObject>>;

    create(spec: MavenRepository.AsObject): AsyncData<MavenRepository.AsObject>;

    update(spec: MavenRepository.AsObject): AsyncData<MavenRepository.AsObject>;

}

class ProtoMavenLoader implements MavenLoader {

    loadAll() {
        return undefined;
    }

    create(spec: MavenRepository.AsObject) {
        return this.update(spec);
    }

    update(spec: MavenRepository.AsObject) {
        return undefined;
    }

}

export const DEFAULT_MAVEN_LOADER: MavenLoader = new ProtoMavenLoader();