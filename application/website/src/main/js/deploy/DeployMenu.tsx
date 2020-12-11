import * as React from "react";
import {Menu} from "antd";
import {LeftMenu} from "../layout/Menus";
import {ClusterOutlined, CompressOutlined, ProjectOutlined} from "@ant-design/icons";
import {deployBuildServersLink, deployProjectCreateLink, deployProjectsLink, deploySourceRepositoriesLink, deploySourcesLink, deployTargetsLink} from "./DeployLinks";

const {SubMenu} = Menu;

export type DeployMenuKey = "projects" | "createProject" | "sources" | "repositories" | "buildServers" | "targets"

type Props = {
    open: DeployMenuKey
}

export default class DeployMenu extends React.PureComponent<Props> {

    render() {
        return <LeftMenu>
            <Menu selectedKeys={[this.props.open]} mode="inline" defaultOpenKeys={["projects", "sources"]}>
                <SubMenu key="projects" title={<a href={deployProjectsLink()}>Projects</a>} icon={<ProjectOutlined/>}>
                    <Menu.Item key="createProject">
                        <a href={deployProjectCreateLink()}>Create project</a>
                    </Menu.Item>
                </SubMenu>
                <SubMenu key="sources" title={<a href={deploySourcesLink()}>Sources</a>} icon={<ClusterOutlined/>}>
                    <Menu.Item key="repositories">
                        <a href={deploySourceRepositoriesLink()}>Repositories</a>
                    </Menu.Item>
                    <Menu.Item key="buildServers">
                        <a href={deployBuildServersLink()}>Build servers</a>
                    </Menu.Item>
                </SubMenu>
                <Menu.Item key="targets" icon={<CompressOutlined/>}>
                    <a href={deployTargetsLink()}>Targets</a>
                </Menu.Item>
            </Menu>
        </LeftMenu>;
    }

}