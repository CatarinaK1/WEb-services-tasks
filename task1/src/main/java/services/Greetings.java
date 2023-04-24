package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/greetings")
public class Greetings {
	
	@GET
	@Path("/hello")
	public String Hello(){
		return "Hello My Rest Service! ";
	}
}
