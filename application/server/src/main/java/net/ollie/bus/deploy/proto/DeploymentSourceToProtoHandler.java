package net.ollie.bus.deploy.proto;

import net.olie.bus.deploy.DeploymentSourceHandler;
import net.ollie.bus.deploy.DeployProto;
import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.maven.MavenDeploymentSource;

import javax.inject.Singleton;

@Singleton
public class DeploymentSourceToProtoHandler
        implements DeploymentSourceHandler<DeployProto.DeploySource> {

    @Override
    public DeployProto.DeploySource handle(final MavenDeploymentSource source) {
        return this.newBuilder(source)
                .setMaven(source.toProto())
                .build();
    }

    private DeployProto.DeploySource.Builder newBuilder(final DeploymentSource source) {
        return DeployProto.DeploySource.newBuilder();
    }

}
