package com.sample.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    private AppConfig appConfig;

@Scheduled(fixedDelayString = "${demo.timer}")
    public void runMyProgram() {
    System.out.println("Runs for every 3000 ms as per config file");
    System.out.println("TEST: "+appConfig.getName());
    }
}
