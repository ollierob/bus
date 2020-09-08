package net.ollie.bus.deploy.repository.maven;

import net.ollie.bus.deploy.source.download.DownloadFileProgress;
import net.ollie.bus.deploy.source.maven.MavenArtifact;

public interface RemoteMavenRepository extends MavenRepository {

    @Override
    DownloadFileProgress get(MavenArtifact artifact);

}
