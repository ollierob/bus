package net.ollie.bus.deploy;

import com.google.common.collect.ImmutableSet;

import javax.annotation.Nonnull;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public interface DeploymentFiles {

    DeploymentFiles EMPTY = ImmutableSet::of;

    @Nonnull
    Set<File> files();

    default boolean isEmpty() {
        return this.files().isEmpty();
    }

    default DeploymentFiles and(final DeploymentFiles that) {
        if (this.isEmpty()) return that;
        if (that.isEmpty()) return this;
        final var set = new HashSet<>(this.files());
        set.addAll(that.files());
        return () -> set;
    }

}
