package com.techBlog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techBlog.services.LoginService;

//http://www.springboottutorial.com/creating-web-application-with-spring-boot

@Controller
@SessionAttributes("name")
public class LoginController implements ErrorController{

	@Autowired
	LoginService aLoginService;

	@RequestMapping(value = "/technoFanatico", method = RequestMethod.GET)
	public String ShowLoginPage(ModelMap aMap) {
		return "indexPages/welcomePage";
	}
	
	@RequestMapping(value = "/technoFanatico/blogpost", method = RequestMethod.GET)
	public String ShowBlogPage(ModelMap aMap) {
		return "indexPages/blogPage";
	}
	
	@RequestMapping(value = "/error")
	public String fallback() {
		return "ErrorPage";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
