package me.study.springbootautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Created by dongchul on 2019-09-23.
 */
@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validator);

        Event event = new Event();
        event.setLimit(-1);
        event.setEmail("daf");
        EventValidator eventValidator = new EventValidator();
        Errors errors = new BeanPropertyBindingResult(event, "event");

        //eventValidator.validate(event, errors);
        validator.validate(event, errors);
        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            System.out.println("===== error code =====");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
