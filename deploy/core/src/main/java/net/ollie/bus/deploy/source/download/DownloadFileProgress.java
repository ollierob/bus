package net.ollie.bus.deploy.source.download;

import net.ollie.bus.deploy.DeploymentFile;

import java.util.concurrent.CompletableFuture;

public interface DownloadFileProgress extends DownloadProgress {

    @Override
    CompletableFuture<? extends DeploymentFile> future();

}
