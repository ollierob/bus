package net.ollie.sandwich.deploy.source.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MavenArtifactTest {

    @Test
    void testFilename() {
        assertEquals("foo-1.2-SNAPSHOT.jar", new MavenArtifact("group", "foo", "1.2-SNAPSHOT").filename());
    }

}