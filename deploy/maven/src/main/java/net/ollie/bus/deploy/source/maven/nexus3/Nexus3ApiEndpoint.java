package net.ollie.bus.deploy.source.maven.nexus3;

import javax.ws.rs.Path;

public interface Nexus3ApiEndpoint {

    @Path("search")
    Nexus3SearchApiEndpoint search();

}
