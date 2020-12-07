package net.ollie.sandwich.deploy.source.build.jenkins;

import net.ollie.sandwich.deploy.build.JenkinsProtos;
import net.ollie.protobuf.BuildsProto;

public record JenkinsJob(JenkinsProtos.JenkinsJob spec)
        implements BuildsProto<JenkinsProtos.JenkinsJob> {

    @Override
    public JenkinsProtos.JenkinsJob toProto() {
        return spec;
    }

}
