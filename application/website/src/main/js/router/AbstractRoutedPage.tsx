import * as  React from "react";
import {RouteComponentProps} from "react-router";

export type RoutedPageProps = RouteComponentProps<any>;

export default abstract class AbstractRoutedPage<S = any> extends React.PureComponent<RoutedPageProps, S> {

    private readonly onHashChange = () => this.hashChanged();

    urlParameter(key: string): string | null {
        const location = this.props.location;
        if (!location) return null;
        return new URLSearchParams(location.search).get(key);
    }

    componentDidMount() {
        window.addEventListener("hashchange", this.onHashChange, false);
    }

    componentWillUnmount() {
        window.removeEventListener("hashchange", this.onHashChange, false);
    }

    protected hashChanged(): void {
    }

}