import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/greetings")
public class greetings{

@Get
@Path("/hello")
@Produces (MediaType.PLAIN_TEXT)
public hello(){
return "Hello My Rest Service!";

}

}
