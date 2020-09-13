package net.ollie.bus.deploy.source.maven;

public interface MavenDeploySourceHandler<R> {

    R handle(MavenDeploymentSource source);

}
