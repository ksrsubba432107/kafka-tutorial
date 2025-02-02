package com.example.kafkademo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics="${topic.name}", groupId="${spring.kafka.consumer.group-id}")
	public void getConsumed(String message) {
		LOGGER.info(String.format("message received _> %s", message));
	}

}
