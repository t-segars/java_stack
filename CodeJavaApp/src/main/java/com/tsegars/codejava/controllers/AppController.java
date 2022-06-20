package com.tsegars.codejava.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tsegars.codejava.repositories.UserRepository;
 
@Controller
public class AppController {
 
    @Autowired
    private UserRepository userRepo;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

	public UserRepository getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
}