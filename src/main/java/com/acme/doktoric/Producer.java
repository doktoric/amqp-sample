package com.acme.doktoric;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Producer {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
		amqpTemplate.convertAndSend("Simple message");
		System.out.println("Sent message: Simple message");
	}

}
