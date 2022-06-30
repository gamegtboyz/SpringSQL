package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Initialize.class);
    }
}

@SpringBootApplication
class Initialize {
    @Bean
    DriverManagerDataSource create() {
        return new DriverManagerDataSource(cs);
    }
    
    String cs = "jdbc:mysql://localhost/the_mad_coffee?user=james&password=bond";
}
