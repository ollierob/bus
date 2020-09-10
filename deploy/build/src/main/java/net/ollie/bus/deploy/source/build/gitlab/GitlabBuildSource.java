package net.ollie.bus.deploy.source.build.gitlab;

import net.ollie.bus.deploy.source.GetProgress;
import net.ollie.bus.deploy.source.build.BuildSource;
import net.ollie.bus.deploy.source.download.DownloadSource;

import java.util.Map;

public record GitlabBuildSource(String id, GitlabProject project, Map<String, String> variables, DownloadSource fetchSource) implements BuildSource {

    @Override
    public GetProgress get() {
        return project.trigger(variables, fetchSource);
    }

}
