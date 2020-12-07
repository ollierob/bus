import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class DeployTargetsPage extends DeployBasePage {

    protected menuKey(): DeployMenuKey {
        return "targets";
    }

    protected body() {
        return null;
    }

    protected title(): string {
        return "Deployment Targets";
    }

}