package io.github.samrox2006;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Development
public class MinhaConfiguration {


/*    @Bean
    public CommandLineRunner executar_prod(){
        return args -> {
            System.out.println("RODANDO AS CONFIGURAÇÕES DE PRODUÇÃO");
        };

   }*/

    @Bean
    public CommandLineRunner executar_dev(){
        return args -> {
            System.out.println("RODANDO AS CONFIGURAÇÕES DE DESENVOLVIMENTO");
        };

    }


}