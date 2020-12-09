package net.ollie.sandwich.deploy.source;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.ollie.protobuf.jaxrs.ProtobufCompatibleMessageBodyWriter;
import net.ollie.sandwich.deploy.source.maven.MavenDeploymentModule;
import net.ollie.sandwich.deploy.source.proto.DeploymentSourceToProtoHandler;

import javax.inject.Named;
import javax.inject.Singleton;

public class DeploymentSourceModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new MavenDeploymentModule());
    }

    @Provides
    @Singleton
    @Named("deploySourceProtos")
    ProtobufCompatibleMessageBodyWriter protoWriter(final DeploymentSourceToProtoHandler handler) {
        final var writer = new SourceWriter();
        writer.register(DeploymentSource.class, handler::toProto);
        return writer;
    }

    static class SourceWriter extends ProtobufCompatibleMessageBodyWriter {

        SourceWriter() {
            super(true);
        }

    }

}
