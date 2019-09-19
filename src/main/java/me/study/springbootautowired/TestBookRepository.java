package me.study.springbootautowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("!prod")
//프로파일 표현식 !, & | ...
@Profile("test")
public class TestBookRepository implements BookRepository{

    @Bean
    public BookRepository bookRepository() {
        return new TestBookRepository();
    }
}
