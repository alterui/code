package com.lr.bridge.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lr.bridge.pojo.User;
import com.lr.bridge.service.UserService;
import com.lr.bridge.service.impl.UserServiceImpl;
import com.sun.net.httpserver.HttpServer;

@Controller

public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/show")
	public String getUser(HttpServletRequest request,Model model) {
		User user = new User();
		user = userService.getUser(1);
		model.addAttribute("user", user);
		return "show";
	}
	
	@RequestMapping("/index")
	public String getIndex(HttpServletRequest request,Model model) {
		User user = new User();
		user = userService.getUser(1);
		model.addAttribute("user", user);
		return "index";
	}
}
