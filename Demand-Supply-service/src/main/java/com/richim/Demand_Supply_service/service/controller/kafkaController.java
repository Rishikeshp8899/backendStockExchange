package com.richim.Demand_Supply_service.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richim.Demand_Supply_service.service.DemandProducerKafka;

@RestController
@RequestMapping("/kafka")
public class kafkaController {


    @Autowired
    private DemandProducerKafka producer;

    @GetMapping("/send/{msg}")
    public String send(@PathVariable("msg") String msg) {
    	System.out.println("in send");
        producer.sendMessage(msg);
        return "Message sent!";
    }
	
}
