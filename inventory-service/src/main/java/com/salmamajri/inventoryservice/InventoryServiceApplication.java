package com.salmamajri.inventoryservice;

import com.salmamajri.inventoryservice.Repository.ProductRepository;
import com.salmamajri.inventoryservice.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("PC")
                    .price(7500)
                    .quantity(15)
                    .build());

            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(1200)
                    .quantity(5)
                    .build());

            productRepository.save(Product.builder()
                    .name("Smartphone")
                    .price(4500)
                    .quantity(20)
                    .build());

            productRepository.save(Product.builder()
                    .name("Mouse")
                    .price(150)
                    .quantity(50)
                    .build());


        };
    }
}
