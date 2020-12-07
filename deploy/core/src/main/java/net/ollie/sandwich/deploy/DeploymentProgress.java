package net.ollie.sandwich.deploy;

import javax.annotation.Nonnull;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;

public interface DeploymentProgress {

    @Nonnull
    CompletableFuture<?> future();

    @Nonnull
    default OptionalInt progress() {
        return OptionalInt.empty();
    }

    default boolean isDone() {
        return this.future().isDone();
    }

    default boolean isSuccess() {
        return this.future().isDone() && !this.future().isCompletedExceptionally();
    }

    default boolean isFailed() {
        return this.future().isCompletedExceptionally();
    }

    static DeploymentProgress done() {
        return new DeploymentProgress() {

            @Override
            public OptionalInt progress() {
                return OptionalInt.of(100);
            }

            @Override
            public CompletableFuture<Void> future() {
                return CompletableFuture.completedFuture(null);
            }

        };
    }

}
