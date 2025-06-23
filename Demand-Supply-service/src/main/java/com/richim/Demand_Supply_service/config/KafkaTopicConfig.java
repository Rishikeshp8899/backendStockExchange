package com.richim.Demand_Supply_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {
	 @Bean
	    public NewTopic createMyTopic() {
	        return TopicBuilder.name("myTopic")
	                           .partitions(1)
	                           .replicas(1)
	                           .build();
	        
	    }
	
}
