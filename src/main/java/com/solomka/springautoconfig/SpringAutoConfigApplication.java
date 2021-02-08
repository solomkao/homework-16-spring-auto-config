package com.solomka.springautoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*
Generate Spring Boot application using Spring Initialzr.
Create your own auto-configuration. It should work by the following rules:
Auto-configuration will be enabled if class ConfigurationEnabler is in the classpath;
Auto-configuration has bean than will be created if
‘application.properties’ file contains property “custom.configuration.enabled”
with the value true.
Provide an executable jar for your application.
 */

@SpringBootApplication
public class SpringAutoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAutoConfigApplication.class, args);
    }

}
