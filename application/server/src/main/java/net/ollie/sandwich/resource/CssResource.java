package net.ollie.sandwich.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("css")
public class CssResource extends AbstractResource {

    private static final MediaType MEDIA_TYPE = new MediaType("text", "css");

    @GET
    @Cached(maxAgeMinutes = 10)
    @Path("{file}")
    @Produces("text/css")
    public Response readJs(@PathParam("file") final String file) {
        if (!file.endsWith(".css") || file.contains("/")) return notFound();
        return this.readResource("/css/" + file, MEDIA_TYPE);
    }

}
