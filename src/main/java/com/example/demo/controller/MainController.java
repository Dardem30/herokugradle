package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Роман on 28.10.2017.
 */
@Controller
public class MainController {
    @Autowired
    private CustomerService customerService;
    @GetMapping(value = "/")
    public String main(Model model){
        model.addAttribute("listCustomer",customerService.findAll());
        model.addAttribute("customer",new Customer());
        return "index";
    }
    @PostMapping(value = "/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer")Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/";
    }
}
