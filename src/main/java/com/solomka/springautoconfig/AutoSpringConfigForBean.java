package com.solomka.springautoconfig;

import com.solomka.springautoconfig.utils.Color;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoSpringConfigForBean {
    public AutoSpringConfigForBean() {
        System.out.println(Color.ANSI_RED+"Auto Spring Configuration For Bean was enabled." + Color.ANSI_RESET);

    }
    @Bean
    @ConditionalOnProperty(value = "custom.configuration.enabled", havingValue = "true")
    public String createBean(){
        System.out.println(Color.ANSI_BLUE+"I'm bean from Auto Spring Configuration For Bean"+Color.ANSI_RESET);
        return "I'm bean from AutoSpringConfig.class";
    }
}
