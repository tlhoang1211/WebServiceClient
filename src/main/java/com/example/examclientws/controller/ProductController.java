package com.example.examclientws.controller;

import com.example.examclientws.service.Product;
import com.example.examclientws.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create (Model model) {
        model.addAttribute("product", new Product());
        return "form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String store (@ModelAttribute Product product, Model model) {
        productService.addProduct(product);
        return "redirect:/index";
    }
}
