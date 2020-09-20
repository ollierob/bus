package net.ollie.bus.deploy.source.proto;

import com.google.common.collect.Iterables;
import net.olie.bus.deploy.source.AllDeploymentSourceHandler;
import net.ollie.bus.deploy.DeployProto;
import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.build.BuildSourceHandler;
import net.ollie.bus.deploy.source.build.gitlab.GitlabBuildSource;
import net.ollie.bus.deploy.source.build.jenkins.JenkinsBuildSource;
import net.ollie.bus.deploy.source.maven.MavenDeploymentSource;
import net.ollie.bus.deploy.source.multi.MultiDeploymentSource;

import javax.inject.Singleton;

@Singleton
public class DeploymentSourceToProtoHandler
        implements AllDeploymentSourceHandler<DeployProto.DeploySource>, BuildSourceHandler<DeployProto.DeploySource> {

    private DeployProto.DeploySource.Builder newBuilder(final DeploymentSource source) {
        return DeployProto.DeploySource.newBuilder();
    }

    @Override
    public DeployProto.DeploySource handle(final MavenDeploymentSource source) {
        return this.newBuilder(source)
                .setMaven(source.toProto())
                .build();
    }

    @Override
    public DeployProto.DeploySource handle(final MultiDeploymentSource source) {
        return this.newBuilder(source)
                .setMulti(this.toProto(source))
                .build();
    }

    private DeployProto.MultiDeploySource toProto(final MultiDeploymentSource source) {
        return DeployProto.MultiDeploySource.newBuilder()
                .setId(source.id())
                .addAllSource(Iterables.transform(source.sources(), this::handle))
                .build();
    }

    @Override
    public DeployProto.DeploySource handle(final JenkinsBuildSource jenkins) {
        return this.newBuilder(jenkins)
                .setJenkins(jenkins.toProto())
                .build();
    }

    @Override
    public DeployProto.DeploySource handle(final GitlabBuildSource gitlab) {
        return this.newBuilder(gitlab)
                .setGitlab(gitlab.toProto())
                .build();
    }

}
