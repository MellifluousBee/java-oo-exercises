package org.launchcode.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.launchcode.models.HelloLog;
import org.launchcode.models.HelloMessage;
import org.launchcode.models.dao.HelloLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//just like a handler in python, need it to handle HTTP requests
@Controller //Spring annotation (need import, ctl + shift + o)
//similar to @Component in dependency injection, it's a marker to tell Spring to care about this class
//Spring will create the object for us with this annotation
//Controller code is for routing requests, figuring out which models to pass them on to, which templates should be used, etc.

public class HelloController {
	
	@Autowired //use dependency injection to autowire and instance of this interface
	private HelloLogDao helloLogDao;
	
	//each method is associated with a given URL
	@RequestMapping(value="/hello",method=RequestMethod.GET)//get request to /hello shows form wheras post request tries to process form
		public String helloForm(){
		return "helloform";
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)//all incoming POST requests to this url will be handled in this function
	//@ResponseBody //use to return a plain String until we learn about templates
	public String hello(HttpServletRequest request, Model model){//input parameter takes Spring's special class that represents an http request as a java class 
		//get name parameter from request 
		//will be null if there is no parameter input
		String name= request.getParameter("name");//we will use name as a variable in the url bar
		
		if (name == null || name == ""){
			name= "world";
		}
		
		HelloLog log=new HelloLog(name);
		helloLogDao.save(log);//saves the object created to the database
		
		model.addAttribute("name", name);//method attribute allows Controller to pass info to template
		return "hello"; //hello is the name of the template in current directory
		// can return "folder/hello"
		//return "<h1>" + HelloMessage.getMessage(name)+ "</h1>";
		//usually html will be in View in a template, but we put it here because we def. don't want it in Model class
	}
	
	@RequestMapping(value= "/log")
	public String log(Model model){//get data out of database to display in log template
		
		//get data out of database
		List<HelloLog> logs= helloLogDao.findAll();//uses the method from our interface to return all of our objects
		
		//put data into template
		model.addAttribute("logs", logs);
		return "log";
	}
	
}
