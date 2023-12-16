package com.pandi.kafkaconsumer.Services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ConsumerService {

    @KafkaListener(topics = "Payments",groupId = "payment-group-1")
    public void myconsumer(String message){

        System.out.println("message"+ message);

    }

    @KafkaListener(topics = "Payments",groupId = "payment-group-1")
    public void myconsumer1(String message){

        System.out.println("message"+ message);

    }

    @KafkaListener(topics = "Payments",groupId = "payment-group-1")
    public void myconsumer2(String message){

        System.out.println("message"+ message);

    }

}
