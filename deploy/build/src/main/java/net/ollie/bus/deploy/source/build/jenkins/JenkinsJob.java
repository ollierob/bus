package net.ollie.bus.deploy.source.build.jenkins;

import net.ollie.bus.deploy.build.JenkinsProtos;
import net.ollie.bus.protobuf.BuildsProto;

public record JenkinsJob(JenkinsProtos.JenkinsJob spec)
        implements BuildsProto<JenkinsProtos.JenkinsJob> {

    @Override
    public JenkinsProtos.JenkinsJob toProto() {
        return spec;
    }

}
