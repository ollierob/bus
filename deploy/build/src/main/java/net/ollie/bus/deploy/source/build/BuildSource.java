package net.ollie.bus.deploy.source.build;

import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.DeploymentSourceHandler;
import net.ollie.bus.deploy.source.GetProgress;

import javax.annotation.Nonnull;

public interface BuildSource extends DeploymentSource {

    @Nonnull
    BuildProgress build();

    @Nonnull
    DeploymentSource next();

    @Override
    default GetProgress get() {
        return this.build().then(this.next());
    }

    @Override
    default <R> R handleWith(final DeploymentSourceHandler<R> handler) {
        return handler instanceof BuildSourceHandler<R> gitlabHandler
                ? this.handleWith(gitlabHandler)
                : null;
    }

    <R> R handleWith(BuildSourceHandler<R> handler);

}
