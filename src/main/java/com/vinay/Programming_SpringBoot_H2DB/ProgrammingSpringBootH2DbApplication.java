package com.vinay.Programming_SpringBoot_H2DB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-h2.properties")
public class ProgrammingSpringBootH2DbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProgrammingSpringBootH2DbApplication.class, args);
    }

}
