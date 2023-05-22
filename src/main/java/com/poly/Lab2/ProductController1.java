package com.poly.Lab2;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.Model.Product;



@Controller
public class ProductController1 {

    @GetMapping("/product/form1")
    public String form2(Model model) {
        Product p = new Product();
        p.setName("iPhone 30");
        p.setPrice(5000.0);
        model.addAttribute("product", p); /*?1*/
        return "/product/form1";
    }

    @PostMapping("/product/save1")
    public String save1(@ModelAttribute("product") Product p) { /*?2*/
        return "/product/form1";
    }

    @ModelAttribute("items")
    public List<Product> getItems() { /*?3*/
        return Arrays.asList(new Product("A", 1.0), new Product("B", 12.0));
    }
}