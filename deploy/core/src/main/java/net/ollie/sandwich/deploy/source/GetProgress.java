package net.ollie.sandwich.deploy.source;

import net.ollie.sandwich.deploy.DeploymentFiles;
import net.ollie.sandwich.deploy.DeploymentProgress;

import java.util.concurrent.CompletableFuture;

/**
 * @see net.ollie.sandwich.deploy.target.PutProgress
 */
public interface GetProgress extends DeploymentProgress {

    @Override
    CompletableFuture<? extends DeploymentFiles> future();

}
