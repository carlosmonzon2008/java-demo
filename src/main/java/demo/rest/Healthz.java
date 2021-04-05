package demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Healthz endpoint for liveness and readiness of the application
 *
 * Created by Carlos Monzón on 04/April/2021.
 */
@RestController
@RequestMapping("/healthz")
public class Healthz {

    @RequestMapping(method = RequestMethod.GET)
    public String healthz() {
        return "OK";
    }
}
