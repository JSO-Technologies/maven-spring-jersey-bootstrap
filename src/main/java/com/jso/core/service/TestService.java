package com.jso.core.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.OK;

@Path("test")
public class TestService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/hello")
	public Response hello() {
		final TestResponse response = new TestResponse();
		response.setMessage("Hello world");

		return Response.status(OK).entity(response).build();
	}
}
