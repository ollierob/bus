import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class DeployDashboard extends DeployBasePage {

    protected menuKey(): DeployMenuKey {
        return "projects";
    }

    protected body() {
        return null;
    }

    protected title() {
        return "Projects";
    }

}