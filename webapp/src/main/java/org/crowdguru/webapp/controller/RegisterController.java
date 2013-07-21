package org.crowdguru.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class RegisterController {
	
	@RequestMapping("/register")
	public ModelAndView index(Model m) {
		m.addAttribute("contextPath", context.getContextPath());
		return new ModelAndView("signup");
	}
	
	@Autowired
	private HttpServletRequest context;
}
