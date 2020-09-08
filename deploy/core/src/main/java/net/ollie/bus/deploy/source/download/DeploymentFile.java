package net.ollie.bus.deploy.source.download;

import net.ollie.bus.deploy.DeploymentFiles;

import java.io.File;
import java.util.Collections;
import java.util.Set;

public record DeploymentFile(File file) implements DeploymentFiles {

    @Override
    public Set<File> files() {
        return Collections.singleton(file);
    }

}
