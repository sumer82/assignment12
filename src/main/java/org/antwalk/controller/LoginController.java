package org.antwalk.controller;

import org.antwalk.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showForm(Model theModel) {
		theModel.addAttribute("student", new Student());
		return "portal";
	}

	@RequestMapping("/welcome")
	public String processForm(@ModelAttribute("welcome") Student student, Model mod) {
		mod.addAttribute("FirstName", student.getFirstName());
		mod.addAttribute("LastName", student.getLastName());
		int n = Integer.parseInt(student.getRollNo());
		mod.addAttribute("RollNo", n);
		return "greet";
	}

	@ExceptionHandler(value = NumberFormatException.class)
	public String numberformatHandler(Model theModel) {
		theModel.addAttribute("err", "NumberFormatException");
		return "error";
	}
}
