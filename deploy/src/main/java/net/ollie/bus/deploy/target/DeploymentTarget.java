package net.ollie.bus.deploy.target;

import net.ollie.bus.deploy.source.DeploymentFiles;

/**
 * @see net.ollie.bus.deploy.source.DeploymentSource
 */
public interface DeploymentTarget {

    DeploymentProgress put(DeploymentFiles files);

}
