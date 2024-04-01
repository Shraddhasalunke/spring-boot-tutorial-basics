package com.in28minutes.springboot.tutorial.basics.example.aop.business;

import com.in28minutes.springboot.tutorial.basics.example.aop.data.Dao1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dao1 dao1;

    public String calculateSomething() {
        //Business Logic
        String value = dao1.retrieveSomething();
        LOGGER.info("In Business - {}", value);

        return value;
    }
}