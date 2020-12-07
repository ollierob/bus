package net.ollie.sandwich.resource;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class AbstractBundleResource extends AbstractResource {

    private static final String JSON_MANIFEST = "/js/build-manifest.json";

    private final Map<String, String> bundleCache = Maps.newConcurrentMap();

    protected Response readRouterResource(final String bundleKey) {
        final var replacements = Collections.singletonMap("<!--%BUNDLEs%-->", bundleCache.computeIfAbsent(bundleKey, this::readBundles));
        return this.readResource("/router.html", replacements, MediaType.TEXT_HTML_TYPE);
    }

    private String readBundles(final String manifestKey) {
        try (final var manifest = Objects.requireNonNull(this.getClass().getResourceAsStream(JSON_MANIFEST), "Could not open TS manifest file (was there a build error?)")) {
            final var jsBundleFiles = Sets.<String>newHashSetWithExpectedSize(10);
            final var mapper = new ObjectMapper();
            mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
            final Map<String, Bundle> map = mapper.readValue(manifest, Bundle.TYPE_REFERENCE);
            Maps.filterKeys(map, key -> key.equals("vendors") || key.contains(manifestKey)).forEach((k, bundle) -> jsBundleFiles.addAll(bundle.jsBundleFiles));
            return jsBundleFiles.stream().map(AbstractBundleResource::scriptTag).collect(Collectors.joining("\n"));
        } catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static String scriptTag(final String bundleJs) {
        return "<script src=\"/js/" + bundleJs + "\"></script>";
    }

}
