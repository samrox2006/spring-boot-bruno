package io.github.samrox2006;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfiguration {

    @Bean(name = "dog")
    public Pet dog(){
        return new Pet() {
            @Override
            public void msgLinha() {
                System.out.println("Compre ração para cachorro!");
            }
        };
    }


    @Bean(name = "cat")
    public Pet cat(){
        return new Pet() {
            @Override
            public void msgLinha() {
                System.out.println("Compre ração para gato!");
            }
        };
    }

}
