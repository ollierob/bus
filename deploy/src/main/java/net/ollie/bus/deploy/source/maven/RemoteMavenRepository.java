package net.ollie.bus.deploy.source.maven;

import net.ollie.bus.deploy.source.download.DownloadProgress;

public interface RemoteMavenRepository extends MavenRepository {

    @Override
    DownloadProgress get(MavenArtifact artifact);

}
