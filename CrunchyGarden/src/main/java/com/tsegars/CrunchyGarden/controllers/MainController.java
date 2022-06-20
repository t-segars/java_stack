package com.tsegars.CrunchyGarden.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/garden")
	public String index1() {
		return "garden.jsp";
	}
	
	@RequestMapping("/weather")
	public String index2() {
		return "weather.jsp";
	}

	@RequestMapping("/blog")
	public String index3() {
		return "blog.jsp";
	}
	
	
	
}
