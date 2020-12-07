import * as React from "react";
import "./Ant";
import "./Layout.css";
import "./Header.css";
import TopMenu from "./Menus";
import {Logo} from "./Logo";

type Props = {
    children: React.ReactNode;
    open: "provision" | "deploy" | "manage"
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