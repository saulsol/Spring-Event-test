package com.example.springeventtest.service;

import com.example.springeventtest.domain.Patient;
import com.example.springeventtest.dto.PatientRequest;
import com.example.springeventtest.event.PatientSaveEvent;
import com.example.springeventtest.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public String savePatient(PatientRequest patientRequest){
        Patient patient = Patient.builder()
                .patientName(patientRequest.getPatientName())
                .build();
        Patient save = patientRepository.save(patient);
        applicationEventPublisher.publishEvent(new PatientSaveEvent("환자가 등록되었습니다 : " + save.getId()));

        if(save.getId() == 1L){
            throw new RuntimeException();
        }
        return "처리 완료";
    }

}
