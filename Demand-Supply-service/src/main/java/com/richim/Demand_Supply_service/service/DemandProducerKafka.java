package com.richim.Demand_Supply_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DemandProducerKafka {

	  @Autowired
	   private KafkaTemplate<String, String> kafkaTemplate;
	
	  public void sendMessage(String message) {
	        kafkaTemplate.send("myTopic", message);
	    }
}
