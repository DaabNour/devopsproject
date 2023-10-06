package com.example.devopsproject.repps;

import com.example.devopsproject.entities.MedicalRecord;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}
