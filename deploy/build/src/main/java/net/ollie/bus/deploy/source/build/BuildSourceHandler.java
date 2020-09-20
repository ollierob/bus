package net.ollie.bus.deploy.source.build;

import net.ollie.bus.deploy.source.DeploymentSourceHandler;
import net.ollie.bus.deploy.source.build.gitlab.GitlabBuildSource;
import net.ollie.bus.deploy.source.build.jenkins.JenkinsBuildSource;

public interface BuildSourceHandler<R>
        extends DeploymentSourceHandler<R> {

    R handle(JenkinsBuildSource jenkins);

    R handle(GitlabBuildSource gitlab);

}
