/*
package com.example.SpringRestApi.kafkaConsumer;

import com.example.SpringRestApi.Utill.KafkaAppUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerApp.class);

    @KafkaListener(topics = KafkaAppUtil.TOPIC_NAME,
            groupId = KafkaAppUtil.GROUP_ID)
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}*/
