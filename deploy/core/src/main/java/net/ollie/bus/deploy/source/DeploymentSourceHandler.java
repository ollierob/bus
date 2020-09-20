package net.ollie.bus.deploy.source;

import net.ollie.bus.deploy.source.multi.MultiDeploymentSource;

public interface DeploymentSourceHandler<R> {

    default R handle(final DeploymentSource source) {
        return source.handleWith(this);
    }

    R handle(MultiDeploymentSource multi);

}
