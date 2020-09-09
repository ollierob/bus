package net.ollie.bus.deploy.repository.maven.central;

import net.ollie.bus.deploy.repository.maven.MavenDownloadProgress;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

//https://search.maven.org/remotecontent?filepath=com/google/guava/guava-gwt/29.0-jre/guava-gwt-29.0-jre.jar
public interface MavenCentralSearchResource {

    @GET
    @Path("remotecontent")
    MavenDownloadProgress get(@QueryParam("filepath") String path);

}
