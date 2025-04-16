package com.exemple.vinnisv.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralSettings {

    @Bean
    public String applicationName(){
      return "Sistemas de Vendas";
    };
}
