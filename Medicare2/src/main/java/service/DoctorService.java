package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;

import dao.DoctorDao;
import model.Doctor;

@Service
public class DoctorService {

	@Autowired
	private DoctorDao doctorDao;
	
	

	public void insert(Doctor doctor){
		
		this.doctorDao.insert(doctor);
		
	}
	
}
