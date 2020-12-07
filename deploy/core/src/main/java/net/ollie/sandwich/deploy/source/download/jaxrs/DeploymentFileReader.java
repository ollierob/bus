package net.ollie.sandwich.deploy.source.download.jaxrs;

import net.ollie.sandwich.deploy.source.download.DeploymentFile;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.function.Supplier;

public class DeploymentFileReader implements MessageBodyReader<DeploymentFile> {

    private final Supplier<File> createFile;

    public DeploymentFileReader(final Supplier<File> createFile) {
        this.createFile = createFile;
    }

    @Override
    public boolean isReadable(final Class<?> type, final Type genericType, final Annotation[] annotations, final MediaType mediaType) {
        return DeploymentFile.class.isAssignableFrom(type);
    }

    @Override
    public DeploymentFile readFrom(final Class<DeploymentFile> type, final Type genericType, final Annotation[] annotations, final MediaType mediaType, final MultivaluedMap<String, String> httpHeaders, final InputStream entityStream) throws IOException, WebApplicationException {
        final var file = createFile.get();
        Files.copy(entityStream, file.toPath());
        return new DeploymentFile(file);
    }

}
