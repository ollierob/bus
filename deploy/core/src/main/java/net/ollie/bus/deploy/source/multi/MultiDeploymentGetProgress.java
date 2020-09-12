package net.ollie.bus.deploy.source.multi;

import net.ollie.bus.deploy.DeploymentFiles;
import net.ollie.bus.deploy.source.GetProgress;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

class MultiDeploymentGetProgress implements GetProgress {

    private final Set<? extends GetProgress> progress;

    MultiDeploymentGetProgress(final Set<? extends GetProgress> progress) {
        this.progress = progress;
    }

    @Override
    public CompletableFuture<? extends DeploymentFiles> future() {
        //FIXME simplify
        return progress.stream().reduce(
                CompletableFuture.completedFuture(DeploymentFiles.EMPTY),
                (f, p) -> (CompletableFuture<DeploymentFiles>) p.future(),
                (f1, f2) -> f1.thenCombine(f2, DeploymentFiles::and));
    }

}
