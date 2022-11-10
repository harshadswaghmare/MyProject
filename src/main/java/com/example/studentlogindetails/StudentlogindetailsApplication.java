package com.example.studentlogindetails;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class StudentlogindetailsApplication {
  public static Logger log = LoggerFactory.getLogger(StudentlogindetailsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StudentlogindetailsApplication.class, args);

        log.debug("this is debug message");
        log.warn("this is warning ");
        log.info("this is info message");
        log.error("this is error message");
        log.getName();
    }

}
