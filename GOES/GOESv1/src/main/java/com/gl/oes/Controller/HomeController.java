package com.gl.oes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("texts", "Hello Neeraj");
		return "/index";
	}
	
	

}
