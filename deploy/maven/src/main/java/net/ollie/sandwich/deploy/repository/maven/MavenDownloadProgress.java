package net.ollie.sandwich.deploy.repository.maven;

import net.ollie.sandwich.deploy.source.download.DeploymentFile;
import net.ollie.sandwich.deploy.source.download.DownloadFileProgress;

import java.util.concurrent.CompletableFuture;

public class MavenDownloadProgress implements DownloadFileProgress {

    @Override
    public CompletableFuture<? extends DeploymentFile> future() {
        throw new UnsupportedOperationException(); //TODO
    }

}
