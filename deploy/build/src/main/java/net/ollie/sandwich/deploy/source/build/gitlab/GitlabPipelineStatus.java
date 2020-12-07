package net.ollie.sandwich.deploy.source.build.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @see <a href="https://docs.gitlab.com/ee/api/pipelines.html#get-a-single-pipeline">API</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitlabPipelineStatus {

    private final int id;
    private final String status;

    @JsonCreator
    public GitlabPipelineStatus(
            @JsonProperty("id") final int id,
            @JsonProperty("status") final String status) {
        this.id = id;
        this.status = status;
    }

    public int id() {
        return id;
    }

    public boolean isPending() {
        return switch (status) {
            case "created", "waiting_for_resource", "preparing", "pending" -> true;
            default -> false;
        };
    }

    public boolean isRunning() {
        return switch (status) {
            case "running" -> true;
            default -> false;
        };
    }

    public boolean isDone() {
        return this.isSuccess() || this.isFailed();
    }

    public boolean isSuccess() {
        return switch (status) {
            case "success" -> true;
            default -> false;
        };
    }

    public boolean isFailed() {
        return switch (status) {
            case "failed", "canceled", "skipped" -> true;
            default -> false;
        };
    }

    public String status() {
        return status;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + "[id:" + id
                + ";status:" + status
                + ']';
    }

}
