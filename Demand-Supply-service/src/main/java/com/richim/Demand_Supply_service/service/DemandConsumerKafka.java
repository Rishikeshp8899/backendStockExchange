package com.richim.Demand_Supply_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemandConsumerKafka {

	 @KafkaListener(topics = "myTopic", groupId = "myGroup")
	  public void listen(String message) {
	        System.out.println("Received: " + message);
	    }
	
}
