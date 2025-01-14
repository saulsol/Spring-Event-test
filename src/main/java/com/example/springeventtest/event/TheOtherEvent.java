package com.example.springeventtest.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;


@Getter
@Setter
public class TheOtherEvent extends ApplicationEvent {

    private String theOthers;

    public TheOtherEvent(Object source, String theOthers) {
        super(source);
        this.theOthers = theOthers;
    }
}
