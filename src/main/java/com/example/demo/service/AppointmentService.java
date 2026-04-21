package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repo;

    public Appointment book(Appointment a) {
        return repo.save(a);
    }

    public List<Appointment> getAll() {
        return repo.findAll();
    }

	public void delete(Long id) {
		 repo.deleteById(id);
		
	}
	
	
}