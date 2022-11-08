package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //includes @Configurations so we didn't need to create config class
public class TicketingProjectDataHApplication {

    public static void main(String[] args) {


        SpringApplication.run(TicketingProjectDataHApplication.class, args);
    }

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

}
