package me.study.springbootautowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootautowiredApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootautowiredApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE); // 일반 java project처럼 실행 시키는 방법. webserver가 실행되지 않는다.
        SpringApplication.run(SpringbootautowiredApplication.class, args);
    }

}
