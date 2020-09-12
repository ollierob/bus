package net.ollie.bus.deploy.source.build.gitlab;

import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.build.BuildProgress;
import net.ollie.bus.deploy.source.build.BuildSource;

import java.util.Map;

public record GitlabBuildSource(String id, GitlabProject project, Map<String, String> variables, DeploymentSource next)
        implements BuildSource {

    @Override
    public BuildProgress build() {
        return project.build(variables);
    }

}
