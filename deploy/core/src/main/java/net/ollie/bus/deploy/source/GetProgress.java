package net.ollie.bus.deploy.source;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.DeploymentProgress;

import java.util.concurrent.CompletableFuture;

/**
 * @see net.ollie.bus.deploy.target.PutProgress
 */
public interface GetProgress extends DeploymentProgress {

    @Override
    CompletableFuture<? extends DeploymentFiles> future();

}
