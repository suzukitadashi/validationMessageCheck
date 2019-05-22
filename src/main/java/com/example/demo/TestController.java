package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(path = { "/test" })
@Slf4j
public class TestController {
	
	@ModelAttribute
	private TestForm setUpForm() {
		return new TestForm();
	}

	@GetMapping
	public String init(Model model) {
		
		log.info("init method");
		
		return "test";
	}
	
	@GetMapping(params = "submit")
	public String submit(Model model, @Validated TestForm testForm, BindingResult result) {

		log.info("submit method");

		if(result.hasErrors()) {
			return "test";
		}
		
		return "test";
	}
	
}
