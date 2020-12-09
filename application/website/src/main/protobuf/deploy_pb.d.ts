// package: maven
// file: deploy.proto

import * as jspb from "google-protobuf";
import * as maven_pb from "./maven_pb";
import * as gitlab_pb from "./gitlab_pb";
import * as jenkins_pb from "./jenkins_pb";

export class DeploySourceList extends jspb.Message {
  clearSourceList(): void;
  getSourceList(): Array<DeploySource>;
  setSourceList(value: Array<DeploySource>): void;
  addSource(value?: DeploySource, index?: number): DeploySource;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeploySourceList.AsObject;
  static toObject(includeInstance: boolean, msg: DeploySourceList): DeploySourceList.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeploySourceList, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeploySourceList;
  static deserializeBinaryFromReader(message: DeploySourceList, reader: jspb.BinaryReader): DeploySourceList;
}

export namespace DeploySourceList {
  export type AsObject = {
    sourceList: Array<DeploySource.AsObject>,
  }
}

export class DeploySource extends jspb.Message {
  hasMaven(): boolean;
  clearMaven(): void;
  getMaven(): maven_pb.MavenDeploySource | undefined;
  setMaven(value?: maven_pb.MavenDeploySource): void;

  hasGitlab(): boolean;
  clearGitlab(): void;
  getGitlab(): gitlab_pb.GitlabBuildSource | undefined;
  setGitlab(value?: gitlab_pb.GitlabBuildSource): void;

  hasJenkins(): boolean;
  clearJenkins(): void;
  getJenkins(): jenkins_pb.JenkinsBuildSource | undefined;
  setJenkins(value?: jenkins_pb.JenkinsBuildSource): void;

  hasMulti(): boolean;
  clearMulti(): void;
  getMulti(): MultiDeploySource | undefined;
  setMulti(value?: MultiDeploySource): void;

  getSourceCase(): DeploySource.SourceCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeploySource.AsObject;
  static toObject(includeInstance: boolean, msg: DeploySource): DeploySource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeploySource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeploySource;
  static deserializeBinaryFromReader(message: DeploySource, reader: jspb.BinaryReader): DeploySource;
}

export namespace DeploySource {
  export type AsObject = {
    maven?: maven_pb.MavenDeploySource.AsObject,
    gitlab?: gitlab_pb.GitlabBuildSource.AsObject,
    jenkins?: jenkins_pb.JenkinsBuildSource.AsObject,
    multi?: MultiDeploySource.AsObject,
  }

  export enum SourceCase {
    SOURCE_NOT_SET = 0,
    MAVEN = 1,
    GITLAB = 2,
    JENKINS = 3,
    MULTI = 4,
  }
}

export class MultiDeploySource extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  clearSourceList(): void;
  getSourceList(): Array<DeploySource>;
  setSourceList(value: Array<DeploySource>): void;
  addSource(value?: DeploySource, index?: number): DeploySource;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MultiDeploySource.AsObject;
  static toObject(includeInstance: boolean, msg: MultiDeploySource): MultiDeploySource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MultiDeploySource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MultiDeploySource;
  static deserializeBinaryFromReader(message: MultiDeploySource, reader: jspb.BinaryReader): MultiDeploySource;
}

export namespace MultiDeploySource {
  export type AsObject = {
    id: string,
    sourceList: Array<DeploySource.AsObject>,
  }
}

export class DeployTarget extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeployTarget.AsObject;
  static toObject(includeInstance: boolean, msg: DeployTarget): DeployTarget.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeployTarget, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeployTarget;
  static deserializeBinaryFromReader(message: DeployTarget, reader: jspb.BinaryReader): DeployTarget;
}

export namespace DeployTarget {
  export type AsObject = {
  }
}

export class DeployProjectOrFolder extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  hasSource(): boolean;
  clearSource(): void;
  getSource(): DeploySource | undefined;
  setSource(value?: DeploySource): void;

  hasTarget(): boolean;
  clearTarget(): void;
  getTarget(): DeployTarget | undefined;
  setTarget(value?: DeployTarget): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeployProjectOrFolder.AsObject;
  static toObject(includeInstance: boolean, msg: DeployProjectOrFolder): DeployProjectOrFolder.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeployProjectOrFolder, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeployProjectOrFolder;
  static deserializeBinaryFromReader(message: DeployProjectOrFolder, reader: jspb.BinaryReader): DeployProjectOrFolder;
}

export namespace DeployProjectOrFolder {
  export type AsObject = {
    id: string,
    name: string,
    source?: DeploySource.AsObject,
    target?: DeployTarget.AsObject,
  }
}

