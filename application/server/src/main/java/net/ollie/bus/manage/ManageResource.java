package net.ollie.bus.manage;

import net.ollie.bus.resource.AbstractBundleResource;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Singleton
@Path("manage")
public class ManageResource extends AbstractBundleResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response router() {
        return this.readRouterResource("manage");
    }

}
