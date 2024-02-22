package com.sn.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LibraryEventConsumer {

	
	static final String topicName="library-events";
	
	@KafkaListener(topics = {"topic-one"})
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord) {
		log.info(" Consumer Record {} :" , consumerRecord);
		
	}

}
