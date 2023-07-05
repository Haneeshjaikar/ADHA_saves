package com.adha.dhp.loancalculator.service;

import com.adha.dhp.loancalculator.model.HelloWorld;
import lombok.extern.flogger.Flogger;
import org.springframework.stereotype.Service;

@Service
@Flogger
public class HelloWorldService {

    public HelloWorld helloWorld() {
        log.atInfo().log("Executing helloWorld()");

        return new HelloWorld("hello world!");
    }

}