package com.riceschoots.growth.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiceschootsWebApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(RiceschootsWebApplication.class);

	public static void main(String[] args) {
//		SpringApplication.run(RiceschootsWebApplication.class, args);
        SpringApplication application = new SpringApplication(RiceschootsWebApplication.class);
        application.setRegisterShutdownHook(false);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        LOGGER.info("service web consumer started!!!");
	}
}
