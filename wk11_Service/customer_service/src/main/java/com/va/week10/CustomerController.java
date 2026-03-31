package com.va.week10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());

        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);

        return "customer";
    }

    @PostMapping("/customer")
    public String insertCustomer(@ModelAttribute Customer customer) {
        customerService.insertCustomer(customer);
        return "redirect:/customer";
    }
}
