package br.com.pogger.sistema.erecibos.commons;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class BaseRest {
	@GET
	@Path("/")
	@Produces({"application/json"})
	public String getHelloWorldJSON() {
	    return "{\"result\":\"" + "REST Api" + "\"}";
	}
}
