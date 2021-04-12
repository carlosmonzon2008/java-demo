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

    @RequestMapping(method = RequestMethod.GET)
    public String response() {
        private static final Integer MESSAGE_COUNT = 1;
        private static final String GRETTING_MESSAGE = "Hola";
        private static final String HOSTNAME = System.getenv().getOrDefault("HOSTNAME", "unknown");
        private static final String BACKGROUND_COLOR = "#FF5733";
        JsonObject response = new JsonObject()
                            .put("msgCount", MESSAGE_COUNT)
                            .put("greettingMessage", GRETTING_MESSAGE)
                            .put("podName", HOSTNAME)
                            .put("backgroundColor", BACKGROUND_COLOR);
        return response.encode();
    }
}
