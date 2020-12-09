import AbstractBasePage from "../router/AbstractRoutedPage";
import DeployMenu, {DeployMenuKey} from "./DeployMenu";
import {RightContent} from "../layout/Content";
import * as React from "react";
import {PageBody, PageTitle} from "../layout/PageTitle";

export default abstract class DeployBasePage<S = any> extends AbstractBasePage<S> {

    render() {

        return <>
            <DeployMenu open={this.menuKey()}/>
            <RightContent className={this.contentClass()}>
                <PageTitle title={this.title()}/>
                <PageBody>{this.body()}</PageBody>
            </RightContent>
        </>;

    }

    protected contentClass(): string | undefined {
        return undefined;
    }

    protected abstract menuKey(): DeployMenuKey

    protected abstract body(): React.ReactChild | undefined | null;

    protected abstract title(): React.ReactNode;

}