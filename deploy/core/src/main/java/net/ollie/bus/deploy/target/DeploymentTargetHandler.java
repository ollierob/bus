package net.ollie.bus.deploy.target;

public interface DeploymentTargetHandler<R> {

    default R handle(final DeploymentTarget target) {
        return target.handleWith(this);
    }

}
