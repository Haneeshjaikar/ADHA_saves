package com.adha.dhp.loancalculator.listener;


import com.adha.dhp.loancalculator.dto.ProductDTO;
import com.adha.dhp.loancalculator.dto.ServiceRequestMessageDTO;
import com.adha.dhp.loancalculator.entity.Products;
import com.adha.dhp.loancalculator.entity.ServiceRequest;
import com.adha.dhp.loancalculator.exception.ApplicationException;
import com.adha.dhp.loancalculator.service.ProductService;
import com.adha.dhp.loancalculator.service.ServiceRequestService;
import com.adha.dhp.loancalculator.util.ExceptionMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


@Component
@Validated
@Slf4j
public class MessageListener {

    @Autowired
    ProductService serviceRequestService;

    @Autowired
    ObjectMapper mapper = new ObjectMapper();

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "${rabbitmq.queue.name}", autoDelete = "true"),
                    exchange = @Exchange(value = "${rabbitmq.exchange.name}", type = "direct"),
                    key = "${rabbitmq.routing_key.name}"
            ))

    public void handleMessage(@Valid ProductDTO message) throws JsonProcessingException {

        try {
            if (message==null) {
                throw new ApplicationException("Incoming message is empty");
            }
//            if (message.getApplicationNumber() <= 0) {
//                throw new ApplicationException(ExceptionMessage.INVALID_APPLICATION_NUMBER.getMessage());
//            }
            String str = mapper.writeValueAsString(message);
            log.info(str);
            serviceRequestService.add(mapper.readValue(str, Products.class));
            log.info("Received message from queue 4: {}", message);

        }
        catch(ApplicationException e){
            log.error("An application exception occurred: {}", e.getMessage());
        }
        catch (Exception e) {
            log.error("An error occurred: {}", e.getMessage());
        }
    }
}
