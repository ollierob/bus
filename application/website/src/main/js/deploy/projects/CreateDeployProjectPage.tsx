import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class CreateDeployProjectPage extends DeployBasePage {

    protected body() {
        return undefined;
    }

    protected menuKey(): DeployMenuKey {
        return "createProject";
    }

    protected title(): React.ReactNode {
        return "Create Deployment Project";
    }

}