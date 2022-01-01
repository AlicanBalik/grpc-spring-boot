package com.alican.grpcHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    // Runs the function after dependency injection is done to perform any initialization.
    @PostConstruct
    void started() {
        // Sets application time zone as UTC. UTC timezone is important and needed if we want to build
        // a universal application.
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}
