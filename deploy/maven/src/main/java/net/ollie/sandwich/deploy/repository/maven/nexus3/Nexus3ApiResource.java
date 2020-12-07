package net.ollie.sandwich.deploy.repository.maven.nexus3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @see <a href="https://help.sonatype.com/repomanager3/rest-and-integration-api/search-api">API</a>
 */
public interface Nexus3ApiResource {

    @GET
    @Path("search")
    Nexus3SearchResult search(
            @QueryParam("repository") String repository,
            @QueryParam("group") String groupId,
            @QueryParam("version") String version);

}
