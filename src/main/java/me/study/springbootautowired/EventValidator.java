package me.study.springbootautowired;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//복잡한 비지니스 로직을 검증할때는 validator를 만들어 사용해야한다.
public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Event.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title is not allow"); // errorcode는 messagesource에서 가지고 온다.
    }
}
