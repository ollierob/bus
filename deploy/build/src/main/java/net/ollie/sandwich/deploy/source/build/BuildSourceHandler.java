package net.ollie.sandwich.deploy.source.build;

import net.ollie.sandwich.deploy.source.DeploymentSourceHandler;
import net.ollie.sandwich.deploy.source.build.gitlab.GitlabBuildSource;
import net.ollie.sandwich.deploy.source.build.jenkins.JenkinsBuildSource;

public interface BuildSourceHandler<R>
        extends DeploymentSourceHandler<R> {

    R handle(JenkinsBuildSource jenkins);

    R handle(GitlabBuildSource gitlab);

}
