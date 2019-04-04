package com.okliu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.okliu.springboot.entity.User;
import com.okliu.springboot.repository.UserRepository;

@Controller
public class MainController {
	@Autowired 
	private UserRepository userRepository;
	
	@ResponseBody
	@GetMapping(path="/add") // Map ONLY GET Requests
	public String addNewUser (@RequestParam String name, @RequestParam String email) {
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}

	@ResponseBody
	@GetMapping(path="/all")
	public  Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
}