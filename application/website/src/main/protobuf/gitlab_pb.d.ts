// package: maven
// file: gitlab.proto

import * as jspb from "google-protobuf";

export class GitlabBuildSource extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  hasProject(): boolean;
  clearProject(): void;
  getProject(): GitlabProject | undefined;
  setProject(value?: GitlabProject): void;

  getVariablesMap(): jspb.Map<string, string>;
  clearVariablesMap(): void;
  getFetchsourceid(): string;
  setFetchsourceid(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GitlabBuildSource.AsObject;
  static toObject(includeInstance: boolean, msg: GitlabBuildSource): GitlabBuildSource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GitlabBuildSource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GitlabBuildSource;
  static deserializeBinaryFromReader(message: GitlabBuildSource, reader: jspb.BinaryReader): GitlabBuildSource;
}

export namespace GitlabBuildSource {
  export type AsObject = {
    id: string,
    project?: GitlabProject.AsObject,
    variablesMap: Array<[string, string]>,
    fetchsourceid: string,
  }
}

export class GitlabProject extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  getRef(): string;
  setRef(value: string): void;

  getToken(): string;
  setToken(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GitlabProject.AsObject;
  static toObject(includeInstance: boolean, msg: GitlabProject): GitlabProject.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GitlabProject, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GitlabProject;
  static deserializeBinaryFromReader(message: GitlabProject, reader: jspb.BinaryReader): GitlabProject;
}

export namespace GitlabProject {
  export type AsObject = {
    id: string,
    name: string,
    ref: string,
    token: string,
  }
}

