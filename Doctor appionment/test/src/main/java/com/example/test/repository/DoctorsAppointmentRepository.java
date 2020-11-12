package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.DoctorsAppointment;

@Repository
public interface DoctorsAppointmentRepository extends JpaRepository<DoctorsAppointment, Integer>{

}
