import * as React from "react";
import "./Page.css";
import TopMenu from "./TopMenu";

type Props = {
    children: React.ReactNode;
    open: "deploy" | "manage"
}

export default class Page extends React.PureComponent<Props> {

    render() {
        return <div>
            <TopMenu {...this.props}/>
            {this.props.children}
        </div>;
    }

}