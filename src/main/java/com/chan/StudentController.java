package com.chan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
public String showForm(Model theModel){
		Student thestudent=new Student();
		theModel.addAttribute("student",thestudent);
	return "student-form";
	}
	@RequestMapping("/processForm")	
	public String processForm(@ModelAttribute("student") Student theStudent){
			return "student-confirmation";
	}
}
