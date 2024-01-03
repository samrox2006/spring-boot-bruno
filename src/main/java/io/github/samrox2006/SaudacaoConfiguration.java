package io.github.samrox2006;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
//@Profile("production")
public class SaudacaoConfiguration {

    @Bean(name = "applicationHello")
    public String applicationName() {
        return "Seja bem vindo ao sistema!";
    }
}