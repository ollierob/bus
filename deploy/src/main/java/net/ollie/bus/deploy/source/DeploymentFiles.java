package net.ollie.bus.deploy.source;

import javax.annotation.Nonnull;
import java.io.File;
import java.util.Set;

public interface DeploymentFiles {

    @Nonnull
    Set<File> files();

}
