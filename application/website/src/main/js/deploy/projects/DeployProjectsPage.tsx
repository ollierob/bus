import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";
import {DeployProjectsMenu} from "./DeployProjectsMenu";

export default class DeployProjectsPage extends DeployBasePage {

    protected contentClass() {
        return "projects";
    }

    protected menuKey(): DeployMenuKey {
        return "projects";
    }

    protected title() {
        return <DeployProjectsMenu/>;
    }

    protected body() {
        return null;
    }

}