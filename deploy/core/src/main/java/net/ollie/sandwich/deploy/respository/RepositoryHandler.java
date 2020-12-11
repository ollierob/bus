package net.ollie.sandwich.deploy.respository;

public interface RepositoryHandler<R> {

    default R handle(final Repository repository) {
        return repository.handleWith(this);
    }

}
