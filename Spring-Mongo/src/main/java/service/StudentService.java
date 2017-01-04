package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentMongo;
import model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentMongo stumongo;
	
	public void insert(Student student){
	  this.stumongo.insert(student);
	  
	}
	
	
	
}
