package com.lti.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.lti.entities.Users;
import com.lti.exceptions.HrException;
import com.lti.services.UserService;
import com.lti.services.UserServiceImp;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	
	@ResponseBody
	@PostMapping(value="/register", consumes="application/json")
	public String add(@RequestBody Users user)
	{
		System.out.println(user);
//		Users user =new Users();
//	user.setName("Archana");
//	user.setEmail("arcgha");
//	user.setPassword("ade");
//	user.setDob(LocalDate.of(2019, 10, 20));
//	user.setContact(7219212);
//	user.setAddress("satara");
	try {
		if(service.addUser(user))
			return "OK";
		else
			return "ERROR";
//		System.out.println(user);
	} catch (HrException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "";

	}
	@GetMapping(value="/list", produces="application/json")
	public @ResponseBody List<Users> getDeptList(){
		
		ArrayList<Users> deptList = null;
		try {
			deptList = service.getDeptList();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return deptList;
	}
}
