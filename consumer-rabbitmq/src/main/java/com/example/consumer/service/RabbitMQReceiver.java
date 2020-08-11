package com.example.consumer.service;


import com.example.consumer.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQReceiver {

    @RabbitListener(queues = "${javainuse.rabbitmq.queue}")
    public void listen(Employee in) {
        System.out.println("Message read from myQueue : " + in);
    }




}