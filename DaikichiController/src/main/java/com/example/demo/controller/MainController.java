package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
	
	@RequestMapping("/")
	public  String index() {
		return "Welcome";
				
	}
	@RequestMapping("today") 
		public String index1() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("tomorrow")
		public String index2() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
//	@RequestMapping("/m/{track}/{module}/{lesson}")
//	    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
//	    return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
//	    
//	}

	@RequestMapping("/{city}")
	    public String showCity(@PathVariable("city") String city){
	    return "Congratulations! You will soon travel to!! " + city;
	    
	}
	
	@RequestMapping("/{name}/travel/{city}")
    public String showAction(@PathVariable ("name") String name, @PathVariable ("city") String city){
    return "Congratulations! You will soon travel to!! " + city;
    
    }
	
	@RequestMapping("/{name}/lotto/{number}")
		public String showLottoEven (@PathVariable ("name") String name,@PathVariable("number") int number){
			if  (number%2 == 0){
				return "You will take a grand journey in the near futurem but be wary of tempting offers";}
			else {
					return "You ha`ve enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
				}
			}
	}


