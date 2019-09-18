package com.rest.resource;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greet")
@Singleton
public class GreetResource {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getGreetMessage() {
		String msg = "Goog Evening Pravin";
		return Response.ok(msg).build();
	}
	public void m1(){
       System.out.println("Hey Mangesh");
	}
}
