package com.sakinramazan.ghclogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GhcloggerApplication {

    private static final Logger logger = LogManager.getLogger(GhcloggerApplication.class);

    public static void main(String[] args) {

        logger.info("Sample Messages with Different types to test logs");
        logger.info("Sample Info message");
        logger.error("Sample Error message");
        logger.debug("Sample Debug message");
        logger.warn("Sample Warning message");

        SpringApplication.run(GhcloggerApplication.class, args);
    }

}
