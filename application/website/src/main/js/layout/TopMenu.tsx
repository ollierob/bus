import * as React from "react";
import {Menu} from "antd";
import {CloudDownloadOutlined, SelectOutlined, VerticalAlignBottomOutlined} from "@ant-design/icons";

type Props = {
    open: "deploy" | "manage"
}

export default class TopMenu extends React.PureComponent<Props> {

    render() {
        return <Menu className="topMenu" mode="horizontal" selectedKeys={[this.props.open]}>
            <Menu.Item key="provision" icon={<CloudDownloadOutlined/>}>
                Provision
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