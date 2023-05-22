package com.poly.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.Model.Product;



@Controller
public class ProductController {
	@GetMapping("/product/form")
	public String form() {
		return "product/form";
	}

	@PostMapping("/product/save")
    public String save(@RequestParam("name") String name, @RequestParam("price") Double price) {
        Product product = new Product(name, price);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
		return "product/form";
	}
}
