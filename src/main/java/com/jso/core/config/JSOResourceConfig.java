package com.jso.core.config;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api")
public class JSOResourceConfig extends ResourceConfig {

	public JSOResourceConfig() {
		register(JacksonJsonProvider.class);
		packages("com.jso.core");
	}
}
