package demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;

/**
 * Main application launcher
 *
 * Created by Carlos Monzón on 04/April/2021.
 */
@SpringBootApplication
//@ComponentScan(basePackages = "com.openshift.evg.roadshow.parks.rest,com.openshift.evg.roadshow.parks.db")
//@EnableAutoConfiguration(exclude={ MongoDataAutoConfiguration.class, MongoAutoConfiguration.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
