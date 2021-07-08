package br.com.digitalhouse.apiecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiEcommerceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApiEcommerceApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApiEcommerceApplication.class);
    }
}
