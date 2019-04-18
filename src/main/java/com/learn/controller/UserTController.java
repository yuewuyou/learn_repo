package com.learn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.model.UserT;
import com.learn.service.UserTService;

@Controller
@RequestMapping(value="/data")
public class UserTController {

	@Autowired
	private UserTService userTService;
	
	@RequestMapping(value="/showname",method=RequestMethod.GET)
	public String showUserName(@RequestParam("uid")int uid,HttpServletRequest request,Model model) {
		System.out.println("showname:");
		UserT user = userTService.selectByPrimaryKey(uid);
		if(user!=null) {
			request.setAttribute("name", user.getUserName());
			model.addAttribute("name", user.getUserName());
			return "showName";
		}
		request.setAttribute("error", "没有找到该用户！");
		return "error";
	}
}
