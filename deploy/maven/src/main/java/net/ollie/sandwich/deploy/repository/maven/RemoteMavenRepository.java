package net.ollie.sandwich.deploy.repository.maven;

import net.ollie.sandwich.deploy.source.download.DownloadFileProgress;
import net.ollie.sandwich.deploy.source.maven.MavenArtifact;

public interface RemoteMavenRepository extends MavenRepository {

    @Override
    DownloadFileProgress get(MavenArtifact artifact);

}
