package com.gl.oes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.oes.Domain.User;
import com.gl.oes.Repository.UserRepository;



@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("texts", "This is the login page");
		return "/login";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public ModelAndView loginAuth(@RequestParam("email") String email,
			@RequestParam("password") String pass, Model model)
	{
		User u = new User();
		for(User user: userRepo.findAll())
		{
			if(user.getEmail() == email && user.getPassword() == pass)
			{
			 u = user;
							
			}
			
		}
		
		model.addAttribute(u);
		return new ModelAndView("/users/user");
			
	}
	
	
	
//	@RequestMapping(value="", method=RequestMethod.POST)
//	public String loginAuth(@RequestParam("email") String email, 
//								@RequestParam("password") String password, Model model){
//		
//		User user = userRepo.user(email);
//		Boolean auth = false;
//		if(user != null)
//		{
//			if(user.getPassword() == password)
//				auth = true;
//		} 
//		
//		if(auth)
//			model.addAttribute("user", user);
//		else
//			model.addAttribute("user", "User doesn't exists");
//		
//		return "/users/user";		
//	}

	
}
