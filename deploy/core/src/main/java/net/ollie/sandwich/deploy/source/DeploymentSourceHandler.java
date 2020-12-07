package net.ollie.sandwich.deploy.source;

import net.ollie.sandwich.deploy.source.multi.MultiDeploymentSource;

public interface DeploymentSourceHandler<R> {

    default R handle(final DeploymentSource source) {
        return source.handleWith(this);
    }

    R handle(MultiDeploymentSource multi);

}
