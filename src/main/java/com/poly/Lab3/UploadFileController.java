package com.poly.Lab3;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;

@Controller
public class UploadFileController {
	@Autowired
	ServletContext app;
	
	@GetMapping("/upload/form")
	public String form() {
		return "lab3/upload-file/form";
	}
	
	@PostMapping("/upload/save")
	public String send(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		if(!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			File file_path = new File(app.getRealPath(fileName));
			file.transferTo(file_path);
			System.out.println(file_path);
		}
		return "lab3/upload-file/form";
	}
}
