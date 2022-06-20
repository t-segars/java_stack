package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class HelloHumanApplication {
public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
		
}
		
@RestController class HomeController{
	@RequestMapping("/") public String index(@RequestParam(value="q", required=false)String searchQuery) {
		if(searchQuery == null) {
		return "Hello Human";
		}
		else {
			return"Hello" + " " + searchQuery;
		}
	}
	@RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
}

}