package com.kantive.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KanativeSpringbootApplication {


    @Value("${TARGET:KNative}")
    String target;

    @RestController
    class HelloworldController {
        @GetMapping("/")
        String hello() {

            try {
                TimeUnit.SECONDS.sleep(2);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Hello " + target + "!";



        }
    }

    public static void main(String[] args) {
        SpringApplication.run(KanativeSpringbootApplication.class, args);
    }

}
