package net.ollie.sandwich.deploy.project;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.ollie.protobuf.jaxrs.ProtobufCompatibleMessageBodyWriter;
import net.ollie.sandwich.deploy.project.provider.DeploymentProjectProvider;

import javax.inject.Singleton;
import javax.ws.rs.ext.Provider;

public class DeploymentProjectModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(DeploymentProjectProvider.class).to(MappedDeploymentProjectProvider.class);
    }

    @Provides
    @Singleton
    DeploymentProjectWriter protoWriter(final DeploymentProjectToProtoHandler protoHandler) {
        final var writer = new DeploymentProjectWriter();
        writer.register(DeploymentProjectOrFolder.class, protoHandler::toProto);
        writer.register(DeploymentProjectFolder.class, protoHandler::toProto);
        writer.register(DeploymentProject.class, protoHandler::toProto);
        return writer;
    }

    @Provider
    static class DeploymentProjectWriter extends ProtobufCompatibleMessageBodyWriter {

        DeploymentProjectWriter() {
            super(true);
        }

    }

}
