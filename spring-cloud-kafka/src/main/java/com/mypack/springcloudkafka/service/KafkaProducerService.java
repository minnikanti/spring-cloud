package com.mypack.springcloudkafka.service;

import com.mypack.springcloudkafka.constants.AppConstants;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final String message) {
       log.info("Message sending:{}", message);
       kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }

}
