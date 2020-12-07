package net.ollie.sandwich;

import com.google.inject.Guice;

public class Application {

    public static void main(final String[] args) throws Exception {
        try {
            final var injector = Guice.createInjector(new ServerModule());
            new Server(injector).run();
        } catch (final Throwable ex) {
            ex.printStackTrace();
            System.exit(-1);
        }
    }

}
