package net.ollie.sandwich.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("img")
public class ImageResource extends AbstractResource {

    private static final MediaType PNG = new MediaType("image", "png");

    @GET
    @Cached(maxAgeMinutes = 10)
    @Path("{file}")
    public Response readJs(@PathParam("file") final String file) {
        if (file.contains("/")) return notFound();
        if (file.endsWith(".png")) return this.readResource("/img/" + file, PNG);
        return notFound();
    }

}
