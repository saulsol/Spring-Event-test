package com.example.springeventtest.handler;

import com.example.springeventtest.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class HousekeepingServiceHandler {

    @Async
    @EventListener
    public void cleanAndAssign(PatientDischargeEvent patientDischargeEvent){
        System.out.println("2 : Housekeeping Service: Preparing room for next patient after discharge of "
                +patientDischargeEvent.getPatientName()+" : "+Thread.currentThread().getName());
    }


}
