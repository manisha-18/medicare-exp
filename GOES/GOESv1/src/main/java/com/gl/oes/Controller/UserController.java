package com.gl.oes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gl.oes.Repository.UserRepository;



@Controller
@RequestMapping("/users")
public class UserController {
	
		@Autowired
		private UserRepository userRepo;
		
		@RequestMapping(value="", method = RequestMethod.GET)
		public String listUsers(Model model){
			model.addAttribute("users", userRepo.findAll());	
			return "/users/list";
		}
		
		
}
