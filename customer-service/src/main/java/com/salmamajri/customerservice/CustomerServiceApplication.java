package com.salmamajri.customerservice;

import com.salmamajri.customerservice.Repository.CustomerRepository;
import com.salmamajri.customerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Ali").email("ali@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Salma").email("salma@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Aicha").email("aicha@gmail.com").build());
        };
    }
}


