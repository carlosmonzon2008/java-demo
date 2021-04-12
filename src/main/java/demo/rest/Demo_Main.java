package demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.vertx.core.json.JsonObject;

/**
 * Created by Carlos Monzón on 04/April/2021.
 */
@RestController
@RequestMapping("/api")
public class Demo_Main {

    private int MESSAGE_COUNT = 1;
    private String GRETTING_MESSAGE = "Hola.";
    //private String HOSTNAME = System.getenv().getOrDefault("HOSTNAME", "unknown");
    private String BACKGROUND_COLOR = "#FF5733";

    @RequestMapping(method = RequestMethod.GET)
    public String response() {
        JsonObject response = new JsonObject()
                            .put("msgCount", MESSAGE_COUNT)
                            .put("greettingMessage", GRETTING_MESSAGE)
                            //.put("podName", HOSTNAME)
                            .put("backgroundColor", BACKGROUND_COLOR);
        return response.encode();
    }
}
