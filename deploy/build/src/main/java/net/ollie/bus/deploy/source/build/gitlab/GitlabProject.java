package net.ollie.bus.deploy.source.build.gitlab;

import com.google.common.collect.Maps;
import net.ollie.bus.deploy.build.BuildProtos;
import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.bus.deploy.source.download.DownloadSource;
import net.ollie.bus.protobuf.BuildsProto;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public record GitlabProject(BuildProtos.GitlabProject spec, GitlabProjectResource resource, ScheduledExecutorService executor)
        implements BuildsProto<BuildProtos.GitlabProject> {

    public GetProgress trigger(final Map<String, String> variables, final DownloadSource fetchSource) {
        final var initial = resource.pipelineTrigger(spec.getId(), parameters(spec, variables));
        return GitlabBuildProgress.of(
                initial,
                () -> resource.pipelineStatus(spec.getId(), initial.id()),
                executor,
                fetchSource);
    }

    private static Map<String, String> parameters(final BuildProtos.GitlabProject spec, final Map<String, String> variables) {
        final var parameters = Maps.<String, String>newHashMap();
        parameters.put("ref", spec.getRef());
        parameters.put("token", spec.getToken());
        variables.forEach((k, v) -> parameters.put("variable[" + k + "]", v));
        return parameters;
    }

    @Override
    public BuildProtos.GitlabProject toProto() {
        return spec;
    }

}
