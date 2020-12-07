package net.ollie.sandwich.deploy.source.build.gitlab;

import net.ollie.sandwich.deploy.build.GitlabProtos;
import net.ollie.sandwich.deploy.source.DeploymentSource;
import net.ollie.sandwich.deploy.source.build.BuildProgress;
import net.ollie.sandwich.deploy.source.build.BuildSource;
import net.ollie.sandwich.deploy.source.build.BuildSourceHandler;
import net.ollie.protobuf.BuildsProto;

import java.util.Map;

public record GitlabBuildSource(String id, GitlabProject project, Map<String, String> variables, DeploymentSource next)
        implements BuildSource, BuildsProto<GitlabProtos.GitlabBuildSource> {

    @Override
    public BuildProgress build() {
        return project.build(variables);
    }

    @Override
    public GitlabProtos.GitlabBuildSource toProto() {
        return GitlabProtos.GitlabBuildSource.newBuilder()
                .setId(id)
                .setFetchSourceId(next.id())
                .setProject(project.toProto())
                .build();
    }

    @Override
    public <R> R handleWith(final BuildSourceHandler<R> handler) {
        return handler.handle(this);
    }

}
