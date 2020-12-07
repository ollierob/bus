package net.ollie.sandwich.deploy.source.build.gitlab;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("api/v4/projects")
@Produces(MediaType.APPLICATION_JSON)
public interface GitlabProjectResource {

    @POST
    @Path("{project_id}/trigger/pipeline")
    GitlabPipelineStatus pipelineTrigger(
            @PathParam("project_id") String projectId,
            Map<String, String> parameters);

    @GET
    @Path("{project_id}/pipelines/{pipeline_id}")
    GitlabPipelineStatus pipelineStatus(
            @PathParam("project_id") String projectId,
            @PathParam("pipeline_id") int pipelineId);

}
