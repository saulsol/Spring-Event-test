package com.example.springeventtest.handler;

import com.example.springeventtest.event.PatientDischargeEvent;
import com.example.springeventtest.event.TheOtherEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class TheOtherHandler {

    @Async
    @EventListener
    public void updatePatientHistory(TheOtherEvent theOtherEvent) {
        // Update medical records
        System.out.println(theOtherEvent.getTheOthers()+"----");
    }
}
