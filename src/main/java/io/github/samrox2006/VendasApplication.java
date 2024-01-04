package io.github.samrox2006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName;

  @Cat
    private Pet pet;

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            this.pet.msgLinha();
        };
    }


    @Autowired
    @Qualifier("applicationHello")
    private String applicationHello;

    public VendasApplication() {
    }


    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName+"<br/>"+applicationHello ;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}