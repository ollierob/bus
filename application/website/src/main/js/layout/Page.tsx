import * as React from "react";
import "./Ant";
import "./Page.css";
import "./Header.css";
import TopMenu from "./TopMenu";
import {Logo} from "./Logo";

type Props = {
    children: React.ReactNode;
    open: "deploy" | "manage"
}

export default class Page extends React.PureComponent<Props> {

    render() {
        return <>
            <div className="header">
                <Logo/>
                <TopMenu {...this.props}/>
            </div>
            <div className="content">
                {this.props.children}
            </div>
        </>;
    }

}