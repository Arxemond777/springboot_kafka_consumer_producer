package com.example.demo.controller;

import com.example.demo.service.KafkaExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    private KafkaExampleService kafkaExampleService;

    @RequestMapping("/")
    public void app(@RequestParam(name = "val") String val) {
        System.out.printf(">>>Send to kafka %s%n", val);
        kafkaExampleService.sendMessage(val);
    }

}
