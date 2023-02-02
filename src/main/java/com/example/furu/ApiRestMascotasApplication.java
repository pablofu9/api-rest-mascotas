package com.example.furu;

import com.example.furu.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import(SwaggerConfig.class)
public class ApiRestMascotasApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestMascotasApplication.class, args);
    }

}
