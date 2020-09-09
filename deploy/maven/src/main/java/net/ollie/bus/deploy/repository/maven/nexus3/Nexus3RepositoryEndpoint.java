package net.ollie.bus.deploy.repository.maven.nexus3;

import net.ollie.bus.deploy.repository.maven.MavenDownloadProgress;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface Nexus3RepositoryEndpoint {

    @GET
    @Path("{groupId:.+}/{artifactId}/{version}/{file}")
    MavenDownloadProgress get(
            @PathParam("groupId") String groupId,
            @PathParam("artifactId") String artifactId,
            @PathParam("version") String version,
            @PathParam("file") String file);

}
