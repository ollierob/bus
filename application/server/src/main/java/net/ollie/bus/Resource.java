package net.ollie.bus;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface Resource {

    String APPLICATION_PROTOBUF = "application/protobuf";
    MediaType APPLICATION_PROTOBUF_TYPE = new MediaType("application", "protobuf");

    static Response notFound() {
        return Response.status(Response.Status.NOT_FOUND).build();
    }

}
