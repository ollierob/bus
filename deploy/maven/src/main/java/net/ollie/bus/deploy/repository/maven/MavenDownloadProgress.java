package net.ollie.bus.deploy.repository.maven;

import net.ollie.bus.deploy.source.download.DeploymentFile;
import net.ollie.bus.deploy.source.download.DownloadFileProgress;

import java.util.concurrent.CompletableFuture;

public class MavenDownloadProgress implements DownloadFileProgress {

    @Override
    public int progress() {
        throw new UnsupportedOperationException(); //TODO
    }

    @Override
    public CompletableFuture<? extends DeploymentFile> future() {
        throw new UnsupportedOperationException(); //TODO
    }

}
