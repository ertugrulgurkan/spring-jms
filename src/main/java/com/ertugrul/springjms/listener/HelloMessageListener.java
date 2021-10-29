package com.ertugrul.springjms.listener;

import com.ertugrul.springjms.config.JmsConfig;
import com.ertugrul.springjms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage, @Headers MessageHeaders messageHeaders, Message message) {
        System.out.println("I got a message!");
        System.out.println(helloWorldMessage);
    }
}
