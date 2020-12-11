import {AsyncData} from "../../fetch/AsyncData";

export interface RepositoryLoader {

    loadAll(): AsyncData<ReadonlyArray<any>>

}