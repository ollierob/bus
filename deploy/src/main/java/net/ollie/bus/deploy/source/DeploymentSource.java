package net.ollie.bus.deploy.source;

import java.util.concurrent.CompletableFuture;

/**
 * @see net.ollie.bus.deploy.target.DeploymentTarget
 */
public interface DeploymentSource {

    CompletableFuture<DeploymentFiles> get();

}
