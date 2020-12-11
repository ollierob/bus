import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class DeployProjectsPage extends DeployBasePage {

    protected contentClass() {
        return "projects";
    }

    protected menuKey(): DeployMenuKey {
        return "projects";
    }

    protected title() {
        return "Deployment Projects";
    }

    protected body() {
        return null;
    }

}