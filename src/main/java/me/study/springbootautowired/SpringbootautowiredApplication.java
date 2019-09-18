package me.study.springbootautowired;

import me.study.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class SpringbootautowiredApplication {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootautowiredApplication.class, args);
        var app = new SpringApplication(SpringbootautowiredApplication.class);
        app.addInitializers((ApplicationContextInitializer< GenericApplicationContext>) ctx -> {
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition"));
        });
        app. run(args);
    }

}
