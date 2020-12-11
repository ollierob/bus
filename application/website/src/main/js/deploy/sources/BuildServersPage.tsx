import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class BuildServersPage extends DeployBasePage {

    protected menuKey(): DeployMenuKey {
        return "buildServers";
    }

    protected title(): React.ReactNode {
        return "Build Servers";
    }

    protected body() {
        return undefined;
    }

}