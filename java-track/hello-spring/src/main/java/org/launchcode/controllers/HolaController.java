package org.launchcode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HolaController {
		
		@RequestMapping(value="/hola",method=RequestMethod.POST)//all incoming POST requests to this url will be handled in this function
		//@ResponseBody //use to return a plain String until we learn about templates
		public String hello(HttpServletRequest request, Model model){//input parameter takes Spring's special class that represents an http request as a java class 
			//get name parameter from request in the URL bar
			//will be null if there is no parameter input
			String name= request.getParameter("name");//we will use name as a variable in the url bar
			
			if (name == null || name == ""){
				name= "mundo";
			}
			
			model.addAttribute("name", name);//method attribute allows Controller to pass info to template
			return "hola"; //hello is the name of the template in current directory
			// can return "folder/hello"
			//return "<h1>" + HelloMessage.getMessage(name)+ "</h1>";
			//usually html will be in View in a template, but we put it here because we def. don't want it in Model class
		}
		
	}

