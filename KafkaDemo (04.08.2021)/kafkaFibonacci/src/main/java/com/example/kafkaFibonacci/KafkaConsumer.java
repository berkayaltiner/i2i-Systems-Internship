package com.example.kafkaFibonacci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
class KafKaConsumerService
{
    private final Logger logger = LoggerFactory.getLogger(KafKaConsumerService.class);

    @KafkaListener(topics = Constants.TOPIC_NAME, groupId = Constants.GROUP_ID)
    public void consume(String message)
    {
        logger.info(String.format("Message recieved -> %s", message));
    }
}