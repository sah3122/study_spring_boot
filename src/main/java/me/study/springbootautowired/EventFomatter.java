package me.study.springbootautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by dongchul on 2019-09-24.
 */
//thread safe 하여 bean 등록 가능 및 다른 bean 주입 가능
//data binding 관련해서 사용할 경우 event formatter를 사용하는것을 추천.
@Component
public class EventFomatter implements Formatter<Event> {

    @Autowired
    MessageSource messageSource;

    @Override
    public Event parse(String s, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(s));
    }

    @Override
    public String print(Event event, Locale locale) {
        return event.getId().toString();
    }
}
