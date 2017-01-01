package controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.Student;
import service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stu;
	
	@RequestMapping("/students")
	public Collection<Student> getAllStudents(Model model)
	{
		//Collection<Student> n=stu.getAllStudents();
		//model.addAttribute("student", stu.getAllStudents());
		//System.out.println(n);
		return stu.getAllStudents();
	}
	
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.GET)
	//@ResponseBody
	public Student getStudentById(@PathVariable("id") int id)
	{
		return stu.getStudentById(id);
	}
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.DELETE)
	public void removeStudentById(@PathVariable("id") int id)
	{
		  this.stu.removeStudentById(id);
	}
	
	@RequestMapping(value="/students", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student)
	{
		  stu.updateStudent(student);
	}

	@RequestMapping(value="/students", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student){
		
		this.stu.insertStudent(student);
	}
	
}
