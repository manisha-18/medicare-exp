package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	//@ResponseBody
	public String hello(){
		
		return ("index");
	}

	@RequestMapping("/hello2")
	@ResponseBody
	public String hello2(){
		return "we are doing our work";
	}
}
