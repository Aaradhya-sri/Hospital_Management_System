package net.javaguides.Hospital.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Doctors")

public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Doctor_id")
	private long id;
	
	@Column(name="Doctor_name")
	private String name;
	
	@Column(name="Doctor_age")
	private int age;
	
	@Column(name="Doctor_gender")
	private String gender;
	
	@Column(name="Doctor_specialist_fields")
	private String specialist_fields;
	
	public Doctor() {
		
	}	
	
	public Doctor(String name, int age, String gender, String specialist_fields) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist_fields = specialist_fields;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialist_fields() {
		return specialist_fields;
	}
	public void setSpecialist_fields(String specialist_fields) {
		this.specialist_fields = specialist_fields;
	}
	
	@Override
	public String toString() {
		return "Doctor [id=" +id+ ", name=" +name+ ", age=" +age+ ", gender=" +gender+ ", specialist_fields" +specialist_fields+"]";
}
}
