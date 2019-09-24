package me.study.springbootautowired;

import java.beans.PropertyEditorSupport;

//property editor는 bean 등록 하면 안된다. thread에서 공유하기 때문이다. 사용하려면 Thread Scope에서 사용해야한다.
public class EventEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
