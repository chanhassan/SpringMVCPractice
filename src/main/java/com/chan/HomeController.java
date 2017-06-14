package com.chan;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/showForm")
	public String showForm(){
	return "main-page";
}
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model){
		String theName=request.getParameter("studentName");
		model.addAttribute("message",theName);
		return "helloworld";
		
	}
}
