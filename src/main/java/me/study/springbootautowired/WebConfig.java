package me.study.springbootautowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by dongchul on 2019-09-24.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        //registry.addConverter(new EventConverter.StringToEventConverter());
        registry.addFormatter(new EventFomatter());
    }
}
