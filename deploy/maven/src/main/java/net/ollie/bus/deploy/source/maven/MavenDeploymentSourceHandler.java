package net.ollie.bus.deploy.source.maven;

public interface MavenDeploymentSourceHandler<R> {

    R handle(MavenDeploymentSource source);

}
