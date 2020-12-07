package net.ollie.sandwich.deploy.project.provider;

import net.ollie.sandwich.deploy.project.DeploymentProjectFolder;
import net.ollie.sandwich.deploy.project.DeploymentProjectOrFolder;
import net.ollie.sandwich.utils.provider.MutableVersionedValueProvider;

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

    /**
     * @return parent with new child in it
     */
    default DeploymentProjectFolder createFolder(final String parentId, final String childId, final String name) throws ProjectOperationException {

        //Create child
        final var child = new DeploymentProjectFolder(childId, name, 1);
        final var putChild = this.put(child);
        if (child != putChild) throw new ProjectOperationException("Cannot create child: " + putChild);

        //Update parent
        DeploymentProjectFolder updatedParent;

        do {

            //Get parent
            final var parent = this.get(parentId);
            //TODO delete child if invalid parent
            if (!(parent instanceof DeploymentProjectFolder parentFolder)) throw new ProjectOperationException("Unknown parent");

            updatedParent = parentFolder.with(child);

        } while (!this.didPut(updatedParent));

        return updatedParent;

    }

    class ProjectOperationException extends Exception {

        public ProjectOperationException(final String message) {
            super(message);
        }

    }

}
