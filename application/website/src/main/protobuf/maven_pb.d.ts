// package: maven
// file: maven.proto

import * as jspb from "google-protobuf";

export class MavenDeploySource extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  hasArtifact(): boolean;
  clearArtifact(): void;
  getArtifact(): MavenArtifact | undefined;
  setArtifact(value?: MavenArtifact): void;

  hasRepositoryid(): boolean;
  clearRepositoryid(): void;
  getRepositoryid(): string;
  setRepositoryid(value: string): void;

  hasRepository(): boolean;
  clearRepository(): void;
  getRepository(): MavenRepository | undefined;
  setRepository(value?: MavenRepository): void;

  getRepoCase(): MavenDeploySource.RepoCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MavenDeploySource.AsObject;
  static toObject(includeInstance: boolean, msg: MavenDeploySource): MavenDeploySource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MavenDeploySource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MavenDeploySource;
  static deserializeBinaryFromReader(message: MavenDeploySource, reader: jspb.BinaryReader): MavenDeploySource;
}

export namespace MavenDeploySource {
  export type AsObject = {
    id: string,
    artifact?: MavenArtifact.AsObject,
    repositoryid: string,
    repository?: MavenRepository.AsObject,
  }

  export enum RepoCase {
    REPO_NOT_SET = 0,
    REPOSITORYID = 3,
    REPOSITORY = 4,
  }
}

export class MavenRepository extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getVersion(): number;
  setVersion(value: number): void;

  hasNexus3(): boolean;
  clearNexus3(): void;
  getNexus3(): Nexus3Repository | undefined;
  setNexus3(value?: Nexus3Repository): void;

  hasCentral(): boolean;
  clearCentral(): void;
  getCentral(): MavenCentral | undefined;
  setCentral(value?: MavenCentral): void;

  getDefinitionCase(): MavenRepository.DefinitionCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MavenRepository.AsObject;
  static toObject(includeInstance: boolean, msg: MavenRepository): MavenRepository.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MavenRepository, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MavenRepository;
  static deserializeBinaryFromReader(message: MavenRepository, reader: jspb.BinaryReader): MavenRepository;
}

export namespace MavenRepository {
  export type AsObject = {
    id: string,
    version: number,
    nexus3?: Nexus3Repository.AsObject,
    central?: MavenCentral.AsObject,
  }

  export enum DefinitionCase {
    DEFINITION_NOT_SET = 0,
    NEXUS3 = 10,
    CENTRAL = 11,
  }
}

export class Nexus3Repository extends jspb.Message {
  getUrl(): string;
  setUrl(value: string): void;

  getUsername(): string;
  setUsername(value: string): void;

  getPassword(): string;
  setPassword(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Nexus3Repository.AsObject;
  static toObject(includeInstance: boolean, msg: Nexus3Repository): Nexus3Repository.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Nexus3Repository, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Nexus3Repository;
  static deserializeBinaryFromReader(message: Nexus3Repository, reader: jspb.BinaryReader): Nexus3Repository;
}

export namespace Nexus3Repository {
  export type AsObject = {
    url: string,
    username: string,
    password: string,
  }
}

export class MavenCentral extends jspb.Message {
  getUrl(): string;
  setUrl(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MavenCentral.AsObject;
  static toObject(includeInstance: boolean, msg: MavenCentral): MavenCentral.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MavenCentral, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MavenCentral;
  static deserializeBinaryFromReader(message: MavenCentral, reader: jspb.BinaryReader): MavenCentral;
}

export namespace MavenCentral {
  export type AsObject = {
    url: string,
  }
}

export class MavenArtifact extends jspb.Message {
  getGroupid(): string;
  setGroupid(value: string): void;

  getArtifactid(): string;
  setArtifactid(value: string): void;

  getVersion(): string;
  setVersion(value: string): void;

  getClassifier(): string;
  setClassifier(value: string): void;

  getType(): string;
  setType(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MavenArtifact.AsObject;
  static toObject(includeInstance: boolean, msg: MavenArtifact): MavenArtifact.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MavenArtifact, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MavenArtifact;
  static deserializeBinaryFromReader(message: MavenArtifact, reader: jspb.BinaryReader): MavenArtifact;
}

export namespace MavenArtifact {
  export type AsObject = {
    groupid: string,
    artifactid: string,
    version: string,
    classifier: string,
    type: string,
  }
}

