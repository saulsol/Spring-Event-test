package com.example.springeventtest.handler;

import com.example.springeventtest.event.PatientDischargeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceHandler {

    @Async
    @EventListener
    public void processBill(PatientDischargeEvent patientDischargeEvent){
        System.out.println("1 : Billing Service: Finalizing bill for patient "
                +patientDischargeEvent.getPatientId()+" : "+Thread.currentThread().getName());
    }

}
