package com.poly.Lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import jakarta.validation.Valid;

@Controller
@RequestMapping("student")
public class StudentController {
	@GetMapping("/form")
    public String form(@ModelAttribute("sv") Student sv) {
        return "lab3/student/form";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("sv") Student sv, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("sv", sv);
            System.out.println(sv.getName());
            return "lab3/student/form";
        } 
            return "lab3/student/form";
        
    }

    @ModelAttribute("genders")
    public Map<Boolean, String> getGenders() {
        Map<Boolean, String> map = new HashMap<>();
        map.put(true, "Male");
        map.put(false, "Female");
        return map;
    }

    @ModelAttribute("faculties")
    public List<String> getFaculties() {
        return Arrays.asList("CNTT", "DLNHKS", "QTDN");
    }

    @ModelAttribute("hobbies")
    public Map<String, String> getHobbies() {
        Map<String, String> map = new HashMap<>();
        map.put("T", "Travelling");
        map.put("M", "Music");
        map.put("F", "Food");
        map.put("O", "Other");
        return map;
    }

}
