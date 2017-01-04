package com.gl.oes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.oes.Domain.User;
import com.gl.oes.Repository.UserRepository;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String registerPage(){
		return "/register";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ModelAndView register(@RequestParam("name") String name, 
			@RequestParam("email") String email,
			@RequestParam("pass") String pass){
		userRepo.save(new User(name,email,pass));
		
		return new ModelAndView("redirect:/users");
	}
}
