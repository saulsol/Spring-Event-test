package com.example.springeventtest.controller;

import com.example.springeventtest.dto.PatientDischargeRequest;
import com.example.springeventtest.dto.TheOtherDto;
import com.example.springeventtest.service.PatientDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discharge/api")
public class DischargeProcessController {

    @Autowired
    private PatientDischargeService patientDischargeService;

    @PostMapping("/process")
    public String dischargePatient(@RequestBody PatientDischargeRequest request) {
        return patientDischargeService.dischargePatient(request.getPatientId(), request.getPatientName());
    }

    @PostMapping("/theOther")
    public String theOtherProcess(@RequestBody TheOtherDto request) {
        return patientDischargeService.theOtherProcess(request.getTheOther());
    }

}
