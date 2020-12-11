package net.ollie.sandwich.deploy.respository;

public interface Repository {

    String id();

    int version();

    <R> R handleWith(RepositoryHandler<R> handler);

}
