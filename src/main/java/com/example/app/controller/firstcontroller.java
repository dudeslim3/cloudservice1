package com.example.app.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/policy")
@CrossOrigin(origins="*",allowedHeaders = "Access-Control-Allow-Origin")
public class firstcontroller
{
	
	@Autowired
	RestTemplate restTemplate;
	

	@GetMapping("/service-1")
	public String getValues() {
		return "Getting Called by Service 1";
	}
	
	@GetMapping("/service-1-2")
	public String getValueFromService2() {
		String val = restTemplate.getForObject("http://demo-2-app:8080/service-2", String.class);
		return "Service call from service 1 to service 2 --- " + val;
	}
	
	
	

}
