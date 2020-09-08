package net.ollie.bus.deploy.repository.maven.central;

import net.ollie.bus.deploy.source.download.DownloadFileProgress;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

//https://search.maven.org/remotecontent?filepath=com/google/guava/guava-gwt/29.0-jre/guava-gwt-29.0-jre.jar
public interface MavenCentralSearchEndpoint {

    @GET
    @Path("remotecontent")
    DownloadFileProgress get(@QueryParam("filepath") String path);

}
