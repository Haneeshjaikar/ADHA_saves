package com.adha.dhp.loancalculator.service;

import com.adha.dhp.loancalculator.model.HelloWorld;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
 class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService service;

    @Test
    void testHelloWorld() {
        HelloWorldService helloWorldService = new HelloWorldService();
        HelloWorld actualHelloWorld = helloWorldService.helloWorld();
        assertEquals("hello world!", actualHelloWorld.getMessage());
    }
}
