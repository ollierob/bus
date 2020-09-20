import * as React from "react";
import {Menu} from "antd";

type Props = {
    open: "dashboard"
    children: React.ReactNode
}

export class MenuContent extends React.PureComponent<Props> {

    render() {
        return <>
            <div className="leftMenu">
                <Menu selectedKeys={[this.props.open]}>
                    <Menu.Item key="dashboard">
                        Dashboard
                    </Menu.Item>
                </Menu>
            </div>
            <div className="rightContent">
                {this.props.children}
            </div>
        </>;
    }

}