package com.mypack.springcloudkafka.controller;

import com.mypack.springcloudkafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RequiredArgsConstructor
@Log4j2
@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

    private final KafkaProducerService producerService;

    @PostMapping(value = "/publish")
    public String sendMessageToKafkaTopic(@RequestParam("message") String message, @RequestBody String messageXml) {
        message = message + new Random().nextInt();
        this.producerService.sendMessage(messageXml);
        log.info("Message:{}", message);
        return messageXml;
    }
}
