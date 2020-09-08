package net.ollie.bus.deploy.source.download.jaxrs;

import net.ollie.bus.deploy.source.download.DeploymentFile;
import net.ollie.bus.deploy.source.download.DownloadFileProgress;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

@Provider
public class BlockingDownloadFileProgressReader implements MessageBodyReader<DownloadFileProgress> {

    private final Supplier<File> createFile;

    public BlockingDownloadFileProgressReader(final Supplier<File> createFile) {
        this.createFile = createFile;
    }

    @Override
    public boolean isReadable(final Class<?> type, final Type genericType, final Annotation[] annotations, final MediaType mediaType) {
        return DownloadFileProgress.class.isAssignableFrom(type);
    }

    @Override
    public DownloadFileProgress readFrom(final Class<DownloadFileProgress> type, final Type genericType, final Annotation[] annotations, final MediaType mediaType, final MultivaluedMap<String, String> httpHeaders, final InputStream entityStream) throws IOException, WebApplicationException {
        final var file = createFile.get();
        Files.copy(entityStream, file.toPath());
        final var downloaded = new DeploymentFile(file);
        return new DownloadFileProgress() {

            @Override
            public CompletableFuture<? extends DeploymentFile> future() {
                return CompletableFuture.completedFuture(downloaded);
            }

            @Override
            public int progress() {
                return 100;
            }
        };
    }

}