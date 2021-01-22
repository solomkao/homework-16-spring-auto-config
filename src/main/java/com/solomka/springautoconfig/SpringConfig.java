package com.solomka.springautoconfig;

import com.solomka.springautoconfig.utils.Color;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    public SpringConfig(){
        System.out.println(Color.ANSI_CYAN+"Simple Configuration was enabled."+Color.ANSI_RESET);}

}
