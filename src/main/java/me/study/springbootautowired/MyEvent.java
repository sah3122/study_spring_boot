package me.study.springbootautowired;

import org.springframework.context.ApplicationEvent;

/**
 * Created by dongchul on 2019-09-23.
 */
public class MyEvent {

    private int data;
    private Object source;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
