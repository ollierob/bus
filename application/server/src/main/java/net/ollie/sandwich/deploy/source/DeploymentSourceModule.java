package net.ollie.sandwich.deploy.source;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.ollie.protobuf.jaxrs.ProtobufCompatibleMessageBodyWriter;
import net.ollie.sandwich.deploy.source.maven.MavenDeploymentModule;
import net.ollie.sandwich.deploy.source.maven.MavenDeploymentSource;
import net.ollie.sandwich.deploy.source.proto.DeploymentSourceToProtoHandler;

import javax.inject.Singleton;
import javax.ws.rs.ext.Provider;

public class DeploymentSourceModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new MavenDeploymentModule());
    }

    @Provides
    @Singleton
    DeploymentSourceWriter protoWriter(final DeploymentSourceToProtoHandler handler) {
        final var writer = new DeploymentSourceWriter();
        writer.registerCollection(DeploymentSource.class, handler::toProtoList);
        writer.registerCollection(MavenDeploymentSource.class, handler::toProtoList); //TODO drop duplicate
        return writer;
    }

    @Provider
    static class DeploymentSourceWriter extends ProtobufCompatibleMessageBodyWriter {

        DeploymentSourceWriter() {
            super(true);
        }

    }

}
