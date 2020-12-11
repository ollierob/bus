package net.ollie.sandwich.deploy.repository;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import net.ollie.protobuf.jaxrs.ProtobufCompatibleMessageBodyWriter;
import net.ollie.sandwich.deploy.repository.maven.MavenRepositoryModule;
import net.ollie.sandwich.deploy.repository.proto.RepositoryToProtoHandler;
import net.ollie.sandwich.deploy.respository.Repository;

import javax.inject.Singleton;
import javax.ws.rs.ext.Provider;

public class RepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.install(new MavenRepositoryModule());
    }

    @Provides
    @Singleton
    RepositoryWriter provideRepositoryWriter(final RepositoryToProtoHandler protoHandler) {
        final var writer = new RepositoryWriter();
        writer.register(Repository.class, protoHandler::toProto);
        writer.registerCollection(Repository.class, protoHandler::toProtos);
        return writer;
    }

    @Provider
    static class RepositoryWriter extends ProtobufCompatibleMessageBodyWriter {

        RepositoryWriter() {
            super(true);
        }

    }

}
