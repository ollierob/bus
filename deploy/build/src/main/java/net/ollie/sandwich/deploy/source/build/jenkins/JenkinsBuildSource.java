package net.ollie.sandwich.deploy.source.build.jenkins;

import net.ollie.sandwich.deploy.build.JenkinsProtos;
import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.deploy.source.build.BuildProgress;
import net.ollie.sandwich.deploy.source.build.BuildSource;
import net.ollie.sandwich.deploy.source.build.BuildSourceHandler;
import net.ollie.protobuf.BuildsProto;

public record JenkinsBuildSource(String id, JenkinsJob job, DeploymentSource next)
        implements BuildSource, BuildsProto<JenkinsProtos.JenkinsBuildSource> {

    @Override
    public BuildProgress build() {
        throw new UnsupportedOperationException(); //TODO
    }

    @Override
    public <R> R handleWith(final BuildSourceHandler<R> handler) {
        return handler.handle(this);
    }

    @Override
    public JenkinsProtos.JenkinsBuildSource toProto() {
        return JenkinsProtos.JenkinsBuildSource.newBuilder()
                .setId(id)
                .setJob(job.toProto())
                .build();
    }

}
