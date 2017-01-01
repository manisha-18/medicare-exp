package service;

import org.springframework.stereotype.Service;

import model.Doctor;
import repositories.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	private DoctorRepository doctorRepository;
	
	@Override
	public Iterable<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(String id) {
		// TODO Auto-generated method stub
		return doctorRepository.findOne(id);
	}

	@Override
	public void insertDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.save(doctor);
	}

	@Override
	public void deleteDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.delete(doctor);
		
	}

}
