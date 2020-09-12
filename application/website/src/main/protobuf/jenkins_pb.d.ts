// package: maven
// file: jenkins.proto

import * as jspb from "google-protobuf";

export class JenkinsBuildSource extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  hasProject(): boolean;
  clearProject(): void;
  getProject(): JenkinsProject | undefined;
  setProject(value?: JenkinsProject): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): JenkinsBuildSource.AsObject;
  static toObject(includeInstance: boolean, msg: JenkinsBuildSource): JenkinsBuildSource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: JenkinsBuildSource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): JenkinsBuildSource;
  static deserializeBinaryFromReader(message: JenkinsBuildSource, reader: jspb.BinaryReader): JenkinsBuildSource;
}

export namespace JenkinsBuildSource {
  export type AsObject = {
    id: string,
    project?: JenkinsProject.AsObject,
  }
}

export class JenkinsProject extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): JenkinsProject.AsObject;
  static toObject(includeInstance: boolean, msg: JenkinsProject): JenkinsProject.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: JenkinsProject, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): JenkinsProject;
  static deserializeBinaryFromReader(message: JenkinsProject, reader: jspb.BinaryReader): JenkinsProject;
}

export namespace JenkinsProject {
  export type AsObject = {
  }
}

