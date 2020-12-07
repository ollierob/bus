import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class DeploySourcesPage extends DeployBasePage {

    protected menuKey(): DeployMenuKey {
        return "sources";
    }

    protected body(): React.ReactNode {
        return null;
    }

}