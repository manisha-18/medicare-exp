package service;

import model.Doctor;

public interface DoctorService {
	
	public Iterable<Doctor> getAllDoctors();
	public Doctor getDoctorById(String id);
	public void insertDoctor(Doctor doctor);
	public void deleteDoctor(Doctor doctor);
	

}
