package net.ollie.bus.deploy.source.multi;

import com.google.common.collect.Sets;
import net.ollie.bus.deploy.source.DeploymentSource;
import net.ollie.bus.deploy.source.GetProgress;

import java.util.Set;

public record MultiDeploymentSource(String id, Set<? extends DeploymentSource> sources) implements DeploymentSource {

    @Override
    public GetProgress get() {
        final var progress = Sets.<GetProgress>newHashSet();
        sources.forEach(source -> progress.add(source.get()));
        return new MultiDeploymentGetProgress(progress);
    }

}
