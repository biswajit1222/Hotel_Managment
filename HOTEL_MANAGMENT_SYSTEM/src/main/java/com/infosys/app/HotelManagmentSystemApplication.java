package com.infosys.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class HotelManagmentSystemApplication {
static Logger logger = LoggerFactory.getLogger(HotelManagmentSystemApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HotelManagmentSystemApplication.class, args);
		logger.info("<<<<<<<<<<<<<<<<<<<appication Started>>>>>>>>>>>>>>>");
	}

}
