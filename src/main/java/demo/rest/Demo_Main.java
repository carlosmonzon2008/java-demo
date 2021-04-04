package demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Carlos Monzón on 04/April/2021.
 */
@Path("/")
public class Demo_Main {

    @GET
    @Produces("text/plain")
    public String response(){
        return "{'response': 'hello'}";
    }
}
