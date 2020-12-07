package net.ollie.sandwich.deploy.source.build.gitlab;

import com.google.common.collect.Maps;
import net.ollie.sandwich.deploy.build.GitlabProtos;
import net.ollie.sandwich.deploy.source.build.BuildProgress;
import net.ollie.protobuf.BuildsProto;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public record GitlabProject(GitlabProtos.GitlabProject spec, GitlabProjectResource resource, ScheduledExecutorService executor)
        implements BuildsProto<GitlabProtos.GitlabProject> {

    public BuildProgress build(final Map<String, String> variables) {
        final var initial = resource.pipelineTrigger(spec.getId(), parameters(spec, variables));
        return GitlabBuildProgress.of(
                initial,
                () -> resource.pipelineStatus(spec.getId(), initial.id()),
                executor);
    }

    private static Map<String, String> parameters(final GitlabProtos.GitlabProject spec, final Map<String, String> variables) {
        final var parameters = Maps.<String, String>newHashMap();
        parameters.put("ref", spec.getRef());
        parameters.put("token", spec.getToken());
        variables.forEach((k, v) -> parameters.put("variable[" + k + "]", v));
        return parameters;
    }

    @Override
    public GitlabProtos.GitlabProject toProto() {
        return spec;
    }

}
