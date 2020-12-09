import * as React from "react";
import {Menu} from "antd";

export class DeployProjectsMenu extends React.PureComponent {

    render() {
        return <>
            Deployment Projects
            <Menu className="menu" mode="horizontal" selectedKeys={[]}>
                <Menu.Item>Create project</Menu.Item>
                <Menu.Divider/>
                <Menu.Item>Create group</Menu.Item>
            </Menu>
        </>;
    }

}