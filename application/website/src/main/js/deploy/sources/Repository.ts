import {Repository as RepositoryProto} from "../../../protobuf/repository_pb";

export const EmptyNexusRepo: Readonly<RepositoryProto.AsObject> = {id: null, maven: {id: null, version: 0, nexus3: {url: null, password: null, username: null}}};
export const EmptyMavenCentralRepo: Readonly<RepositoryProto.AsObject> = {id: null, maven: {id: null, version: 0, central: {url: null}}};