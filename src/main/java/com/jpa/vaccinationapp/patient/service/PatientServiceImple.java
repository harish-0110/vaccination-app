package com.jpa.vaccinationapp.patient.service;

import com.jpa.vaccinationapp.patient.PatientRepository;
import com.jpa.vaccinationapp.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImple implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Patient signIN(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllUsers() {
        return this.patientRepository.findAll();
    }

}
