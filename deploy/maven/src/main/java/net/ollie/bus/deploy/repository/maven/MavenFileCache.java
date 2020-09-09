package net.ollie.bus.deploy.repository.maven;

import net.ollie.bus.deploy.source.maven.MavenArtifact;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.InputStream;
import java.util.function.Supplier;

public interface MavenFileCache {

    @Nonnull
    File getOrWrite(
            MavenArtifact artifact,
            Supplier<? extends InputStream> input);

}
