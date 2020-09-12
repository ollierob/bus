// package: maven
// file: deploy.proto

import * as jspb from "google-protobuf";
import * as maven_pb from "./maven_pb";
import * as gitlab_pb from "./gitlab_pb";

export class DeploySource extends jspb.Message {
  hasMaven(): boolean;
  clearMaven(): void;
  getMaven(): maven_pb.MavenDeploySource | undefined;
  setMaven(value?: maven_pb.MavenDeploySource): void;

  hasGitlab(): boolean;
  clearGitlab(): void;
  getGitlab(): gitlab_pb.GitlabBuildSource | undefined;
  setGitlab(value?: gitlab_pb.GitlabBuildSource): void;

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
  }

  export enum SourceCase {
    SOURCE_NOT_SET = 0,
    MAVEN = 1,
    GITLAB = 2,
  }
}

