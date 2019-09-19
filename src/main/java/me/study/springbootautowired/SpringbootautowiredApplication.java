package me.study.springbootautowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties") // property 추가
public class SpringbootautowiredApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootautowiredApplication.class, args);
    }

}
