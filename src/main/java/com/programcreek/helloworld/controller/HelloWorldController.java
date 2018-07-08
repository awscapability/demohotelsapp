package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect()
	
	{
		
		System.out.println("Success");
		return "helloworld";
	
	}

}
