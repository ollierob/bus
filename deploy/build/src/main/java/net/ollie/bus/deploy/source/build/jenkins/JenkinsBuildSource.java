package net.ollie.bus.deploy.source.build.jenkins;

import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.build.BuildProgress;
import net.ollie.bus.deploy.source.build.BuildSource;

public record JenkinsBuildSource(String id, JenkinsJob job, DeploymentSource next)
        implements BuildSource {

    @Override
    public BuildProgress build() {
        throw new UnsupportedOperationException(); //TODO
    }

}
