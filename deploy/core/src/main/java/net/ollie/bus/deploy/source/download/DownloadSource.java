package net.ollie.bus.deploy.source.download;

import net.ollie.bus.deploy.source.DeploymentSource;

public interface DownloadSource extends DeploymentSource {

    @Override
    DownloadProgress get();

}
