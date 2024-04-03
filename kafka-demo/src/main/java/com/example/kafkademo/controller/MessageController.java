package com.example.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkademo.kafka.KafkaProducer;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@GetMapping("/send")
	public String getSendMessage(@RequestParam("message")String message) {
		kafkaProducer.sendMessage(message);
		return "Message send to kafka";
	}
}
