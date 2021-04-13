package demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import io.vertx.core.json.JsonObject;

/**
 * Created by Carlos Monzón on 04/April/2021.
 */
@RestController
@RequestMapping("/api")
public class Demo_Main {

    private int MESSAGE_COUNT = 0;
    private String GRETTING_MESSAGE = "Hola.";
    private String HOSTNAME = System.getenv().getOrDefault("HOSTNAME", "unknown");
    //private String BACKGROUND_COLOR = "#5bbf45";//Green
    //private String BACKGROUND_COLOR = "#6bbded";//Blue
    private String BACKGROUND_COLOR = "#f2f25e";//Yellow
    //private String BACKGROUND_COLOR = "#FF5733";//Orange
    //private String BACKGROUND_COLOR = "#FF0000";//Red

    @RequestMapping(method = RequestMethod.GET, produces={"application/json"})
    //@GetMapping(produces = MediaType.APPLICATION_JSON)
    //@RequestHeader(value = "User-Agent")
    public String response(@RequestHeader(value="User-Agent") String userAgent) {
        MESSAGE_COUNT++;
        JsonObject response = new JsonObject()
                            .put("msgCount", MESSAGE_COUNT)
                            .put("greettingMessage", GRETTING_MESSAGE)
                            .put("podName", HOSTNAME)
                            .put("backgroundColor", BACKGROUND_COLOR)
                            .put("User-Agent", userAgent);
        //response.setContentType("application/json");
        return response.encode();
    }
}
