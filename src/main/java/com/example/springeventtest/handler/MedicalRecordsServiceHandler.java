package com.example.springeventtest.handler;

import com.example.springeventtest.event.PatientDischargeEvent;
import com.example.springeventtest.event.TheOtherEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MedicalRecordsServiceHandler {

    @Async
    @EventListener
    public void updatePatientHistory(PatientDischargeEvent patientDischargeEvent) {
        // Update medical records
        System.out.println("3 : Medical Records Service: Updating records for patient "
                +patientDischargeEvent.getPatientId()+" : "+Thread.currentThread().getName());
    }

    @Async
    @EventListener
    public void updatePatientHistory(TheOtherEvent theOtherEvent) {
        // Update medical records
        System.out.println(theOtherEvent.getTheOthers()+"----2");
    }
}
