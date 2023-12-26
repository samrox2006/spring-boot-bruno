package io.github.samrox2006;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas BrunoSam";
    }

    @Bean(name = "outraConfiguracao")
    public String outraConfiguracao(){
        return "Sistema de Vendas";
    }
}