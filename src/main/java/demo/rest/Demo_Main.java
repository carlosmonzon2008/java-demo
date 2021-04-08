package demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Carlos Monzón on 04/April/2021.
 */
@RestController
@RequestMapping("/")
public class Demo_Main {

    @RequestMapping(method = RequestMethod.GET)
    public String response() {
        return "{'response': 'hello 18:31'}";
    }
}
