import * as React from "react";

export const PageTitle = (props: {title: React.ReactNode}) => <div className="title">{props.title}</div>;

export const PageBody = (props: {children: React.ReactNode}) => <div className="body">{props.children}</div>;