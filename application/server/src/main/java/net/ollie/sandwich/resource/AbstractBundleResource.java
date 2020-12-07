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

    protected Response readHtmlResource(final String resource) {
        return this.readResource("/js/" + resource, MediaType.TEXT_HTML_TYPE);
    }

}
