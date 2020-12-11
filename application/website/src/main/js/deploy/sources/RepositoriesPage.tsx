import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class RepositoriesPage extends DeployBasePage {

    protected menuKey(): DeployMenuKey {
        return "repositories";
    }

    protected title(): React.ReactNode {
        return "Repositories";
    }

    protected body() {
        return undefined;
    }

}