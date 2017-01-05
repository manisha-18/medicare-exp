package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Doctor;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import service.DoctorService;

@RestController
public class DoctorController {


	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value="/doctors",
			method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public String insert(@RequestBody Doctor doctor){
		
		doctorService.insert(doctor);
		return "insertion completed";
		
	}
	
	@RequestMapping(value="/doctors",method=RequestMethod.GET)
	@ResponseBody
	public String getAllDoctors(){
		
		return doctorService.getAllDoctors();
		
	}
	
}
