import DeployBasePage from "../DeployBasePage";
import {DeployMenuKey} from "../DeployMenu";

export default class CreateDeploySourcePage extends DeployBasePage {

    protected menuKey(): DeployMenuKey {
        return "createSource";
    }

    protected title() {
        return "Create Deployment Source";
    }

    protected body() {
        return undefined;
    }

}