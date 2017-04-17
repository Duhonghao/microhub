package com.microhub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.microhub.mapper")
public class Application {



	private static Logger log =  LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		log.info("app run");
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);

	}
}
