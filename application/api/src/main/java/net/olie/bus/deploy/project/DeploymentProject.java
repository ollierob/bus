package net.olie.bus.deploy.project;

import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.target.DeploymentTarget;

public record DeploymentProject(String id, String name, DeploymentSource source, DeploymentTarget target) {

}
