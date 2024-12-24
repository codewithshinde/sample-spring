package com.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SampleSpringApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SampleSpringApplication.class, args);
		SampleService sampleServiceDemo = context.getBean(SampleService.class);
		sampleServiceDemo.runMyProgram();
	}

}
