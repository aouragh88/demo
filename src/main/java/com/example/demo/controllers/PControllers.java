package com.example.demo.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class PControllers {
	
	@GetMapping("/")
	public String home(@RequestParam(required=false, defaultValue="world") String name , ModelMap modelmap) {
		
		
		/*
		 * name = Request.getParameter("name") != null && !
		 * Request.getParameter("name").isEmpty() ? Request.getParameter("name") :
		 * "world";
		 */
		
				
		modelmap.put("name", name);
		
		return "pages/home";
	}

}
