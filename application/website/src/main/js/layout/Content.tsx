import * as React from "react";

export const RightContent = (props: {className?: string, children?: React.ReactNode}) => {
    return <div className={"rightContent " + props.className}>{props.children}</div>;
};