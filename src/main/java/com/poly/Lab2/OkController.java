package com.poly.Lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class OkController {
	
	@RequestMapping(value = "/ok")
	public String ok(Model model) {
		model.addAttribute("result","ok");
		return "ok";
	}
	
	@RequestMapping(value = "ctrl/ok")
	public String m1(Model model) {
		model.addAttribute("result","ok-m1");
		System.out.println("ok-m1");
		return "ok";
	}
	
	@RequestMapping(value = "ctrl/ok", method = RequestMethod.GET)
	public String m2(Model model) {
		model.addAttribute("result","ok-m2");
		System.out.println("ok-m2");
		return "ok";
	}
	
	@RequestMapping(value = "ctrl/ok", method = RequestMethod.POST, params = "x")
	public String m3(Model model) {
		model.addAttribute("result","ok-m3");
		System.out.println("ok-m3");
		return "ok";
	}
}








