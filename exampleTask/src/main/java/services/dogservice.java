package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/dogservice")
public class dogservice {
	
	@GET
	@Path("/info")
	public String info() {
		return "This is a Dog Service";
	}

}
