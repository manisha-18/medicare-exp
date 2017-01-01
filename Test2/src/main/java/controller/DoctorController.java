package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



import model.Doctor;
import service.DoctorService;

@Controller
public class DoctorController {

	
	private DoctorService doctorService;
	@Autowired
	public void setDoctorService( DoctorService doctorService) {
        this.doctorService = doctorService;
    }

	@ResponseBody
	@RequestMapping (value="/doctors",method=RequestMethod.GET)
	public Iterable<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorService.getAllDoctors();
	}

	
	
	@RequestMapping (value="/doctors",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertDoctor(@RequestBody Doctor doctor) {
		// TODO Auto-generated method stub
		doctorService.insertDoctor(doctor);
	}

	
}
