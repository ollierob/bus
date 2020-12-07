import * as React from "react";
import {LeftMenu} from "../../layout/Menus";
import {RightContent} from "../../layout/Content";

type Props = {}

type State = {}

export default class DeployDashboard extends React.PureComponent<Props, State> {

    render() {
        return <>
            <LeftMenu/>
            <RightContent/>
        </>;
    }

}