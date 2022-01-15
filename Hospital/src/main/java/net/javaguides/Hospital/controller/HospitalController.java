package net.javaguides.Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.Hospital.model.Doctor;
import net.javaguides.Hospital.model.Patients;
import net.javaguides.Hospital.repository.DoctorRepository;
import net.javaguides.Hospital.repository.PatientRepository;

@CrossOrigin(origins = "http://localhost:8080/api/v1/Hospital")
@RestController
public class HospitalController {
	
	@RequestMapping("/api/v1/")
	public String home() {
		return "<h1>Welcome to Hospital Management System</h1>";
	}	

	@Autowired
	private DoctorRepository DoctorRepository;
	private PatientRepository PatientRepository;
	
	@GetMapping("/")
	public List<Doctor> getAllDoctor(){
		 return DoctorRepository.findAll();
	}	
	
	@GetMapping("/")
	public List<Patients> getAllPatient(){
		 return PatientRepository.findAll();
	}
}
