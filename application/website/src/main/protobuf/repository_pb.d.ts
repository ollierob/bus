// package: maven
// file: repository.proto

import * as jspb from "google-protobuf";
import * as maven_pb from "./maven_pb";

export class Repository extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  hasMaven(): boolean;
  clearMaven(): void;
  getMaven(): maven_pb.MavenRepository | undefined;
  setMaven(value?: maven_pb.MavenRepository): void;

  getRepoCase(): Repository.RepoCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Repository.AsObject;
  static toObject(includeInstance: boolean, msg: Repository): Repository.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Repository, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Repository;
  static deserializeBinaryFromReader(message: Repository, reader: jspb.BinaryReader): Repository;
}

export namespace Repository {
  export type AsObject = {
    id: string,
    maven?: maven_pb.MavenRepository.AsObject,
  }

  export enum RepoCase {
    REPO_NOT_SET = 0,
    MAVEN = 2,
  }
}

export class RepositoryList extends jspb.Message {
  clearRepositoryList(): void;
  getRepositoryList(): Array<Repository>;
  setRepositoryList(value: Array<Repository>): void;
  addRepository(value?: Repository, index?: number): Repository;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RepositoryList.AsObject;
  static toObject(includeInstance: boolean, msg: RepositoryList): RepositoryList.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: RepositoryList, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RepositoryList;
  static deserializeBinaryFromReader(message: RepositoryList, reader: jspb.BinaryReader): RepositoryList;
}

export namespace RepositoryList {
  export type AsObject = {
    repositoryList: Array<Repository.AsObject>,
  }
}

