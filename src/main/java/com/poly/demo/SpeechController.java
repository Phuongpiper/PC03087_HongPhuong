package com.poly.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpeechController {
	@Autowired
	Speech speech;
	
	@GetMapping("/speech/hello")
	public void hello() {
		speech.sayGreeting();
	}
}
