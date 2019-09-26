package me.study.springbootautowired;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

/**
 * Created by dongchul on 2019-09-26.
 */
@Service
public class EventService {

    //ide compile option 에서 추가를 해줘야 한다.
    @NonNull
    public String createEvent(@NonNull String name) {
        return "hello" + name;
    }
}
