package com.solomka.springautoconfig;

import com.solomka.springautoconfig.utils.Color;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
public class AutoSpringConfigForClass {
    public AutoSpringConfigForClass() {
        System.out.println(Color.ANSI_GREEN+"Auto Spring Configuration For Class was enabled."+Color.ANSI_RESET);
    }
}
