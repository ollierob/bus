// package: maven
// file: jenkins.proto

import * as jspb from "google-protobuf";

export class JenkinsBuildSource extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  hasJob(): boolean;
  clearJob(): void;
  getJob(): JenkinsJob | undefined;
  setJob(value?: JenkinsJob): void;

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
    job?: JenkinsJob.AsObject,
  }
}

export class JenkinsJob extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): JenkinsJob.AsObject;
  static toObject(includeInstance: boolean, msg: JenkinsJob): JenkinsJob.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: JenkinsJob, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): JenkinsJob;
  static deserializeBinaryFromReader(message: JenkinsJob, reader: jspb.BinaryReader): JenkinsJob;
}

export namespace JenkinsJob {
  export type AsObject = {
    id: string,
    name: string,
  }
}

