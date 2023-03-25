package com.smart.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.dao.UserRepository;
import com.smart.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
@Autowired
private UserRepository userRepository;
	
	@RequestMapping("/about")
	public String dashboard(Model model , Principal principal) {
		
		String email=principal.getName();
		System.out.println(email);
		
		
User user=	userRepository.getUserByUserName(email);
		
		model.addAttribute("user",user );
		
		
		
		
		
		return "normal/about";
	}
	
	
	
	
	
	

}
