package com.solomka.springautoconfig;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    public SpringConfig(){
        System.out.println("Simple configuration was enabled.");
    }
}
