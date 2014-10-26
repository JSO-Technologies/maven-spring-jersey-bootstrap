package com.jso.core.Test.service;

import com.jso.core.Test.api.TestResponse;
import com.jso.core.Test.api.User;
import com.jso.core.Test.controller.TestController;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.OK;

@Path("healthcheck")
public class TestService {
	final private TestController controller;

	@Autowired
	public TestService(final TestController controller) {
		this.controller = controller;
	}

	/**
	 * http://localhost:8080/api/healthcheck/hello?name=Jimmy
	 * @param name
	 * @return
	 */
	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello(@QueryParam("name") final String name) {
		return sayHello(name != null ? name : "toto");
	}

	/**
	 * http://localhost:8080/api/healthcheck/hello/Jimmy
	 * @param name
	 * @return
	 */
	@GET
	@Path("/hello/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloPath(@PathParam("name") final String name) {
		return sayHello(name);
	}

	/**
	 * http://localhost:8080/api/healthcheck/hello
	 * {"name":"Jimmy"}
	 * @param user
	 * @return
	 */
	@POST
	@Path("/hello")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloPost(@Valid final User user) {
		return sayHello(user.getName());
	}

	private Response sayHello(final String name) {
		final TestResponse response = new TestResponse();
		response.setMessage(controller.sayHello(name));

		return Response.status(OK).entity(response).build();
	}
}
