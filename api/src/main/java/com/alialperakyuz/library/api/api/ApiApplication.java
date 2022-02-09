package com.alialperakyuz.library.api.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.alialperakyuz.library"})
@ComponentScan("com.alialperakyuz.library")
@EnableJpaRepositories("com.alialperakyuz.library")
@EntityScan("com.alialperakyuz.library")
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
