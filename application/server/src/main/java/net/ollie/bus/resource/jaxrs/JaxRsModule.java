package net.ollie.bus.resource.jaxrs;

import com.google.inject.AbstractModule;
import net.ollie.protobuf.jaxrs.ProtobufDirectMessageBodyReader;
import net.ollie.protobuf.jaxrs.ProtobufDirectMessageBodyWriter;

public class JaxRsModule extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();
        this.bind(CacheControlFilter.class);
        this.bind(ProtobufDirectMessageBodyWriter.class);
        this.bind(ProtobufDirectMessageBodyReader.class);
    }

}
