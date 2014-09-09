package com.jso.core.service.config;

import com.jso.core.service.TestService;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class JSOResourceConfig extends ResourceConfig {

	public JSOResourceConfig() {

		//jackson
		register(JacksonFeature.class);

		//services
		register(TestService.class);
	}
}
