package net.ollie.bus.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("js")
public class JavascriptResource extends AbstractResource {

    private static final MediaType MEDIA_TYPE = new MediaType("application", "javascript");

    @GET
    @Cached(maxAgeMinutes = 10)
    @Path("{file}")
    @Produces("application/javascript")
    public Response readJs(@PathParam("file") final String file) {
        if (file.startsWith(".") || !file.endsWith(".js") || file.contains("/")) {
            return notFound();
        }
        return this.readResource("/js/" + file, MEDIA_TYPE);
    }

}