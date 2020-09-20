package net.ollie.bus.deploy.project;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.olie.bus.deploy.project.DeploymentProject;
import net.olie.bus.deploy.project.DeploymentProjectFolder;
import net.olie.bus.deploy.project.DeploymentProjectOrFolder;
import net.olie.bus.deploy.project.provider.DeploymentProjectProvider;
import net.ollie.protobuf.jaxrs.ProtobufCompatibleMessageBodyWriter;

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
    @Named("protos")
    ProtobufCompatibleMessageBodyWriter protoWriter(final DeploymentProjectToProtoHandler protoHandler) {
        final var writer = new ProtobufCompatibleMessageBodyWriter();
        writer.register(DeploymentProjectOrFolder.class, protoHandler::toProto);
        writer.register(DeploymentProjectFolder.class, protoHandler::toProto);
        writer.register(DeploymentProject.class, protoHandler::toProto);
        return writer;
    }

}
