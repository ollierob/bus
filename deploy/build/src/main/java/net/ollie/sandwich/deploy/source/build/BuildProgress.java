package net.ollie.sandwich.deploy.source.build;

import net.ollie.sandwich.deploy.DeploymentProgress;
import net.ollie.sandwich.deploy.source.ChainedGetProgress;
import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.deploy.source.GetProgress;

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
