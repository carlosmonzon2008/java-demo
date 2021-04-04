package demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.json.simple.JSONObject;

/**
 * Created by Carlos Monzón on 04/April/2021.
 */
@Path("/")
public class Demo_Main {

    @GET
    @Produces("application/json")
    public JSONObject demo_main(){
        JSONParser parser = new JSONParser();
        JSONObject json_response = (JSONObject) parser.parse("{'response': 'hello!'}");
        return json_response;
    }
}
