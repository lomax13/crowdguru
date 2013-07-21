package org.crowdguru.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class RegisterController {
	
	@RequestMapping("/register")
	public ModelAndView index(Model m) {
		return new ModelAndView("signup");
	}
}
