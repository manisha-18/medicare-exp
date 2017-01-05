package service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import dao.DoctorDao;
import model.Doctor;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

@Service
public class DoctorService {

	@Autowired
	private DoctorDao doctorDao;
	
	

	public void insert(Doctor doctor){
		
		this.doctorDao.insert(doctor);
		
	}
	
	
	public String getAllDoctors(){
		
		return doctorDao.getAllDoctors();
		
	}
}
