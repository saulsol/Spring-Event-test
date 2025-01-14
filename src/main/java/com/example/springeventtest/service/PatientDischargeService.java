package com.example.springeventtest.service;

import com.example.springeventtest.event.PatientDischargeEvent;
import com.example.springeventtest.event.TheOtherEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PatientDischargeService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public String dischargePatient(String patientId, String patientName){
        applicationEventPublisher.publishEvent(new PatientDischargeEvent(this, patientId, patientName));
        return "Patient " + patientName + " with ID " + patientId + " discharged successfully!";
    }

    public String theOtherProcess(String value){
        applicationEventPublisher.publishEvent(new TheOtherEvent(this, value));
        return "theOthersProcessSuccess!";
    }




}
