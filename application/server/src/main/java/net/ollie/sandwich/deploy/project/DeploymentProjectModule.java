package net.ollie.sandwich.deploy.project;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.ollie.protobuf.jaxrs.ProtobufCompatibleMessageBodyWriter;
import net.ollie.sandwich.deploy.project.provider.DeploymentProjectProvider;

import javax.inject.Named;
import javax.inject.Singleton;

public class DeploymentProjectModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(DeploymentProjectProvider.class).to(MappedDeploymentProjectProvider.class);
    }

    @Provides
    @Singleton
    @Named("deployProjectProtos")
    ProtobufCompatibleMessageBodyWriter protoWriter(final DeploymentProjectToProtoHandler protoHandler) {
        final var writer = new DeploymentWriter();
        writer.register(DeploymentProjectOrFolder.class, protoHandler::toProto);
        writer.register(DeploymentProjectFolder.class, protoHandler::toProto);
        writer.register(DeploymentProject.class, protoHandler::toProto);
        return writer;
    }

    static class DeploymentWriter extends ProtobufCompatibleMessageBodyWriter {

        DeploymentWriter() {
            super(true);
        }

    }

}
