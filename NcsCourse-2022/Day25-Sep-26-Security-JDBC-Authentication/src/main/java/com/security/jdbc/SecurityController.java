package com.security.jdbc;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	@GetMapping("/admin")
	public String admin(Model m, Principal p) {
		
		m.addAttribute("msg","you are Logged i as =" +p.getName());
		
		return "admin";
	}

	
	@GetMapping("/user")
	public String user(Model m, Principal p) {
		
		m.addAttribute("msg","you are Logged i as =" +p.getName());
		
		return "user";
	}

}
