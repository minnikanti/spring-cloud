package com.mypack.springcloudkafka.service;

import com.mypack.springcloudkafka.constants.AppConstants;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaConsumerService {

    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void consume(String message) {
        log.info("Message consumed: {}", message);
    }
}
