package net.ollie.bus.deploy.repository.maven.provider;

import com.google.common.base.MoreObjects;
import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.MavenRepository;
import net.ollie.bus.deploy.repository.maven.central.MavenCentralRepository;
import net.ollie.bus.deploy.repository.maven.central.MavenCentralSearchResource;
import net.ollie.bus.deploy.repository.maven.nexus3.Nexus3Repository;
import net.ollie.bus.deploy.repository.maven.nexus3.Nexus3RepositoryResource;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.internal.BasicAuthentication;

import java.util.Optional;
import java.util.function.Supplier;

public class MavenRepositoryBuilder {

    private static final String MAVEN_CENTRAL = "https://repo.maven.apache.org/maven2/";

    private final Supplier<ResteasyClient> client;

    public MavenRepositoryBuilder(final Supplier<ResteasyClient> client) {
        this.client = client;
    }

    public Optional<MavenRepository> build(final MavenProtos.MavenRepository spec) {
        return switch (spec.getDefinitionCase()) {
            case NEXUS3 -> Optional.of(new Nexus3Repository(spec, this.resource(spec.getNexus3())));
            case CENTRAL -> Optional.of(new MavenCentralRepository(spec, this.resource(spec.getCentral())));
            case DEFINITION_NOT_SET -> Optional.empty();
        };
    }

    private Nexus3RepositoryResource resource(final MavenProtos.Nexus3Repository spec) {
        final var target = client.get().target(spec.getUrl());
        if (spec.getUsername() != null) target.register(new BasicAuthentication(spec.getUsername(), spec.getPassword()));
        return target.proxy(Nexus3RepositoryResource.class);
    }

    private MavenCentralSearchResource resource(final MavenProtos.MavenCentral spec) {
        final var target = client.get().target(MoreObjects.firstNonNull(spec.getUrl(), MAVEN_CENTRAL));
        return target.proxy(MavenCentralSearchResource.class);
    }

}
