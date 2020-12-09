import AbstractBasePage from "../router/AbstractRoutedPage";
import DeployMenu, {DeployMenuKey} from "./DeployMenu";
import {RightContent} from "../layout/Content";
import * as React from "react";
import {PageTitle} from "../layout/PageTitle";

export default abstract class DeployBasePage extends AbstractBasePage {

    render() {

        return <>
            <DeployMenu open={this.menuKey()}/>
            <RightContent className={this.contentClass()}>
                <PageTitle title={this.title()}/>
                {this.body()}
            </RightContent>
        </>;

    }

    protected contentClass(): string | undefined {
        return undefined;
    }

    protected abstract menuKey(): DeployMenuKey

    protected abstract body(): React.ReactNode;

    protected abstract title(): React.ReactNode;

}