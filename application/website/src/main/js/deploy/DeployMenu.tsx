import * as React from "react";
import {Menu} from "antd";
import {LeftMenu} from "../layout/Menus";
import {ClusterOutlined, CompressOutlined, ProjectOutlined} from "@ant-design/icons";
import {deployProjectsLink, deploySourcesLink, deployTargetsLink} from "./DeployLinks";

const {SubMenu} = Menu;

export type DeployMenuKey = "projects" | "sources" | "targets"

type Props = {
    open: DeployMenuKey
}

export default class DeployMenu extends React.PureComponent<Props> {

    render() {
        return <LeftMenu>
            <Menu selectedKeys={[this.props.open]}>
                <Menu.Item key="projects" icon={<ProjectOutlined/>}>
                    <a href={deployProjectsLink()}>Projects</a>
                </Menu.Item>
                <Menu.Item key="sources" icon={<ClusterOutlined/>}>
                    <a href={deploySourcesLink()}>Sources</a>
                </Menu.Item>
                <Menu.Item key="targets" icon={<CompressOutlined/>}>
                    <a href={deployTargetsLink()}>Targets</a>
                </Menu.Item>
            </Menu>
        </LeftMenu>;
    }

}