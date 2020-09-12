package net.ollie.bus.process;

import com.google.common.base.Preconditions;
import net.ollie.bus.Resource;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

public abstract class AbstractResource implements Resource {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Response readResource(final String resource, final MediaType mediaType) {
        return this.readResource(resource, Collections.emptyMap(), mediaType);
    }

    protected Response readResource(final String resource, final Map<String, String> replacements, final MediaType mediaType) {
        Preconditions.checkArgument(!resource.contains(".."));
        final var stream = this.getClass().getResourceAsStream(resource);
        if (stream == null) {
            logger.warn("Could not find resource {}", resource);
            return notFound();
        } else {
            return Response.ok(replace(stream, replacements)).type(mediaType).build();
        }
    }

    protected static Response notFound() {
        return Response.status(404).build();
    }

    private static InputStream replace(final InputStream in, final Map<String, String> replacements) {
        if (replacements.isEmpty()) return in;
        try {
            final var out = IOUtils.toString(in, Charset.defaultCharset());
            final var replaced = replacements.entrySet().stream().reduce(out, (current, replace) -> current.replace(replace.getKey(), replace.getValue()), String::concat);
            return IOUtils.toInputStream(replaced, Charset.defaultCharset());
        } catch (final IOException iex) {
            //Shouldn't happen
            throw new WebApplicationException(iex, Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

}
