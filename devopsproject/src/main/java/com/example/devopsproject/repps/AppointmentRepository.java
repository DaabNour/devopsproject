package com.example.devopsproject.repps;

import com.example.devopsproject.entities.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
