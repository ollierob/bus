package net.ollie.bus.deploy.respository;

import javax.annotation.CheckForNull;

public interface RepositoryProvider<R extends Repository> {

    @CheckForNull
    R get(String id);

}
