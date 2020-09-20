package net.olie.bus.deploy.project.provider;

import net.olie.bus.deploy.project.DeploymentProjectFolder;
import net.olie.bus.deploy.project.DeploymentProjectOrFolder;
import net.ollie.bus.utils.provider.MutableVersionedValueProvider;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;

public interface DeploymentProjectProvider
        extends MutableVersionedValueProvider<String, DeploymentProjectOrFolder> {

    default String key(final DeploymentProjectOrFolder item) {
        return item.id();
    }

    default int version(final DeploymentProjectOrFolder item) {
        return item.version();
    }

    @Nonnull
    @CheckReturnValue
    default DeploymentProjectOrFolder root() {
        return this.require("root");
    }

    default DeploymentProjectFolder createFolder(final String parentId, final String childId, final String name) throws ProjectOperationException {

        //Create child
        final var child = this.put(new DeploymentProjectFolder(parentId, childId, 1));
        if (!(child instanceof DeploymentProjectFolder childFolder)) throw new ProjectOperationException("Invalid child");

        //Update parent
        DeploymentProjectFolder updatedParent;

        do {

            //Get parent
            final var parent = this.get(parentId);
            //TODO delete child if invalid parent
            if (!(parent instanceof DeploymentProjectFolder folder)) throw new ProjectOperationException("Unknown parent");

            updatedParent = folder.with(childFolder);

        } while (!this.didPut(updatedParent));

        return childFolder;

    }

    class ProjectOperationException extends Exception {

        public ProjectOperationException(final String message) {
            super(message);
        }

    }

}
