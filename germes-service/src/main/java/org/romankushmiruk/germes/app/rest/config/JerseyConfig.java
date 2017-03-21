package org.romankushmiruk.germes.app.rest.config;

import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("api")
/**
 * REST web-service configuration for Jersey
 * @author RomanKushmiruk
 *
 */
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.romankushmiruk.germes.app.rest");
    }
}

