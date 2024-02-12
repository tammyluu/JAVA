package com.example.patientsmvc;

import com.example.patientsmvc.entities.Patient;
import com.example.patientsmvc.repository.IPatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Bean //execute automatique au dermarrage
    CommandLineRunner commandLineRunner(IPatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Toto", new Date(),false, 12));
            patientRepository.save(new Patient(null,"Tata", new Date(),true, 18));
            patientRepository.save(new Patient(null,"Titi", new Date(),true, 35));
            patientRepository.save(new Patient(null,"Tutu", new Date(),false, 44));
            patientRepository.findAll().forEach( patient -> {
                System.out.println(patient.getNom());
            });
        };
    }
}
