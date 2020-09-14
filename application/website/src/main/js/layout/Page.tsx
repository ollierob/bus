import * as React from "react";
import "./Ant";
import "./Page.css";
import TopMenu from "./TopMenu";
import {Layout} from "antd";

const {Header, Content} = Layout;

type Props = {
    children: React.ReactNode;
    open: "deploy" | "manage"
}

export default class Page extends React.PureComponent<Props> {

    render() {
        return <Layout>
            <Header>
                <TopMenu {...this.props}/>
            </Header>
            <Content>
                {this.props.children}
            </Content>
        </Layout>;
    }

}