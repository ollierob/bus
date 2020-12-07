import * as React from "react";
import {Menu} from "antd";
import {CloudServerOutlined, SelectOutlined, VerticalAlignBottomOutlined} from "@ant-design/icons";

type Props = {
    open: "provision" | "deploy" | "manage"
}

export default class TopMenu extends React.PureComponent<Props> {

    render() {
        return <Menu className="topMenu" mode="horizontal" selectedKeys={[this.props.open]}>
            <Menu.Item key="provision" icon={<CloudServerOutlined/>}>
                <a href="/provision">Provision</a>
            </Menu.Item>
            <Menu.Item key="deploy" icon={<VerticalAlignBottomOutlined/>}>
                <a href="/deploy/">Deploy</a>
            </Menu.Item>
            <Menu.Item key="manage" icon={<SelectOutlined/>}>
                <a href="/manage/">Manage</a>
            </Menu.Item>
        </Menu>;
    }

}

export const LeftMenu = (props: {children?: React.ReactNode}) => <div className="leftMenu">{props.children}</div>;