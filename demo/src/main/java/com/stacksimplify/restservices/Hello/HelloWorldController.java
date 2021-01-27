package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET , path="/helloWorld")
	public String helloWorld()
	{
		return "Hello World!";
	}
	
	@RequestMapping(method=RequestMethod.GET , path="/helloWorld1")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Anshul", "batra", "Gurgaon");
	}
}
