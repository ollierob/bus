package net.olie.bus.deploy.project;

import com.google.common.collect.ImmutableSet;
import net.ollie.bus.deploy.DeployProto;
import net.ollie.bus.deploy.source.DeploymentSourceHandler;
import net.ollie.protobuf.BuildsProto;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.Set;

public record DeploymentProjectFolder(String id, String name, int version, Set<DeploymentProjectOrFolder> children)
        implements DeploymentProjectOrFolder, BuildsProto<DeployProto.DeployProjectOrFolder> {

    public DeploymentProjectFolder(final String id, final String name, final int version) {
        this(id, name, version, Collections.emptySet());
    }

    @Override
    public DeployProto.DeployProjectOrFolder toProto() {
        return DeployProto.DeployProjectOrFolder.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }

    @Override
    public DeployProto.DeployProjectOrFolder toProto(final DeploymentSourceHandler<DeployProto.DeploySource> sourceHandler) {
        return this.toProto();
    }

    @Nonnull
    @CheckReturnValue
    public DeploymentProjectFolder with(final DeploymentProjectOrFolder child) {
        if (children.contains(child)) return this;
        final var newChildren = ImmutableSet.<DeploymentProjectOrFolder>builder().addAll(children);
        newChildren.add(child);
        return new DeploymentProjectFolder(id, name, version + 1, newChildren.build());
    }

}
