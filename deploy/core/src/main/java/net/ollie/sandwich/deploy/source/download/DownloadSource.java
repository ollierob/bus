package net.ollie.sandwich.deploy.source.download;

import net.ollie.sandwich.deploy.source.DeploymentSource;

public interface DownloadSource extends DeploymentSource {

    @Override
    DownloadProgress get();

}
