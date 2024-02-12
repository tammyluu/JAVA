package com.example.patientsmvc.repository;

import com.example.patientsmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient,Long> {
Page<Patient> findByNomContains(String kw, Pageable pageable);
}
