package com.srm.platform.vendor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home/index";
	}

	@RequestMapping("/admin")
	public String admin() {

		return "home/index";
	}

	@RequestMapping(value = "/signin")
	public String login(HttpServletRequest request, Model model) {
		return "signin";
	}

	@RequestMapping(value = "/signout")
	public String logout() {
		return "signout";
	}

	@RequestMapping(value = "/denied")
	public String denied() {
		return "denied";
	}

}
