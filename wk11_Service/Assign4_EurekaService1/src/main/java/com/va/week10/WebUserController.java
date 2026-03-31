package com.va.week10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebUserController {

    @Autowired
    private WebUserService webUserService;

    @GetMapping("/webuser")
    public String showForm(Model model) {
        model.addAttribute("webUser", new WebUser());
        model.addAttribute("states", UserState.values());
        model.addAttribute("users", webUserService.getAllUsers());
        return "webuser";
    }

    @PostMapping("/webuser")
    public String saveUser(@ModelAttribute WebUser webUser, Model model) {
        webUserService.insertUser(webUser);
        model.addAttribute("webUser", new WebUser());
        model.addAttribute("states", UserState.values());
        model.addAttribute("users", webUserService.getAllUsers());
        return "webuser";
    }
}
