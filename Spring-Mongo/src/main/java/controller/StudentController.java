package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Student;
import service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService stuser;
	
	@RequestMapping(value="/students",
			method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public String insert(@RequestBody Student student){
		
		stuser.insert(student);
		return "insertion completed";
		
	}
	

	
}
