package io.github.samrox2006;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class MinhaConfiguration {

    @Profile("production")
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO AS CONFIGURAÇÔES DE PRODUÇÃO");
        };

   }

    @Profile("development")
    @Bean
    public CommandLineRunner executar2(){
        return args -> {
            System.out.println("RODANDO AS CONFIGURAÇÔES DE DEVELOPMENT");
        };

    }


}