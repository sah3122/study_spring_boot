package me.study.springbootautowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongchul on 2019-09-24.
 */
@RestController
public class EventController {

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event) {
        return event.getId().toString();
    }
}
