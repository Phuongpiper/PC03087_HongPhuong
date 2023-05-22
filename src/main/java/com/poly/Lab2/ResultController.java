package com.poly.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResultController {
    
    @RequestMapping("/a")
    public String m1() {
        return "a";
    }
    
    @RequestMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "I come from b");
        return "forward:/a"; // Sử dụng forward để giữ nguyên model attributes khi chuyển tiếp
    }

    
    @RequestMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from c");
        return "redirect:/a"; // Chuyển hướng về /a
    }
    
    @RequestMapping("/d")
    public String m4() {
        return "d"; // Trả về tên view "d"
    }
}

