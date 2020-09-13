package net.ollie.bus.deploy.source.provider;

import net.ollie.bus.deploy.source.DeploymentSource;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public interface DeploymentSourceProvider<D extends DeploymentSource> {

    @CheckForNull
    D get(String id);

    @Nonnull
    default D require(final String id) {
        final var got = this.get(id);
        if (got == null) throw new IllegalArgumentException(id);
        return got;
    }

}
