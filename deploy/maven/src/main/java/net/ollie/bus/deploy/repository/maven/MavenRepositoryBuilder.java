package net.ollie.bus.deploy.repository.maven;

import com.google.common.base.MoreObjects;
import net.ollie.bus.deploy.maven.MavenProtos;
import net.ollie.bus.deploy.repository.maven.central.MavenCentralRepository;
import net.ollie.bus.deploy.repository.maven.central.MavenCentralSearchEndpoint;
import net.ollie.bus.deploy.repository.maven.nexus3.Nexus3Repository;
import net.ollie.bus.deploy.repository.maven.nexus3.Nexus3RepositoryEndpoint;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.internal.BasicAuthentication;

import java.util.function.Supplier;

public class MavenRepositoryBuilder {

    private static final String MAVEN_CENTRAL = "https://repo.maven.apache.org/maven2/";

    private final Supplier<ResteasyClient> client;

    MavenRepositoryBuilder(final Supplier<ResteasyClient> client) {
        this.client = client;
    }

    public MavenRepository build(final MavenProtos.MavenRepository spec) {
        switch (spec.getDefinitionCase()) {
            case NEXUS3:
                return new Nexus3Repository(spec.getId(), this.endpoint(spec.getNexus3()));
            case CENTRAL:
                return new MavenCentralRepository(spec.getId(), this.endpoint(spec.getCentral()));
            default:
                throw new UnsupportedOperationException();
        }
    }

    private Nexus3RepositoryEndpoint endpoint(final MavenProtos.Nexus3Repository spec) {
        final var target = client.get().target(spec.getUrl());
        if (spec.getUsername() != null) target.register(new BasicAuthentication(spec.getUsername(), spec.getPassword()));
        return target.proxy(Nexus3RepositoryEndpoint.class);
    }

    private MavenCentralSearchEndpoint endpoint(final MavenProtos.MavenCentral spec) {
        final var target = client.get().target(MoreObjects.firstNonNull(spec.getUrl(), MAVEN_CENTRAL));
        return target.proxy(MavenCentralSearchEndpoint.class);
    }

}
