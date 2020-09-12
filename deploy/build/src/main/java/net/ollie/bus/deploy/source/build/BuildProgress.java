package net.ollie.bus.deploy.source.build;

import net.ollie.bus.deploy.DeploymentProgress;
import net.ollie.bus.deploy.source.ChainedGetProgress;
import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.GetProgress;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;

public interface BuildProgress extends DeploymentProgress {

    @Nonnull
    @CheckReturnValue
    default GetProgress then(final DeploymentSource next) {
        if (this.isSuccess()) return next.get();
        return new ChainedGetProgress(this, next);
    }

}
