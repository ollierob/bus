import * as React from "react";
import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";
import "./DeploySources.css";

export default class ListDeploySourcesPage extends DeployBasePage {

    protected menuKey(): DeployMenuKey {
        return "sources";
    }

    protected body() {
        return null;
    }

    protected title() {
        return "Deployment Sources";
    }

}