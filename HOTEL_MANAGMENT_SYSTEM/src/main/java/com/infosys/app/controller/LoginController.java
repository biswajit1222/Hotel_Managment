package com.infosys.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.app.dto.LoginDTO;
import com.infosys.app.service.LoginService;

@RestController
public class LoginController {
@Autowired
LoginService loginservice;

	@PostMapping(value="/addUser")
	public String addUser(@RequestBody LoginDTO login) {
		System.out.println("inside login controler:::::::::::");
		String data=loginservice.addUser(login);
		return data;
		
	}
}
