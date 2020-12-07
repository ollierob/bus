import AbstractBasePage from "../router/AbstractRoutedPage";
import DeployMenu, {DeployMenuKey} from "./DeployMenu";
import {RightContent} from "../layout/Content";
import * as React from "react";

export default abstract class DeployBasePage extends AbstractBasePage {

    render() {

        return <>
            <DeployMenu open={this.menuKey()}/>
            <RightContent>
                {this.body()}
            </RightContent>
        </>;

    }

    protected abstract menuKey(): DeployMenuKey

    protected abstract body(): React.ReactNode;

}