package com.wordflow.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wordflow.model.User;

@Controller
public class HomeController {
    
    @GetMapping("/home")
    public String home(Model model) {
        User currentUser = User.getCurrentUser();
        if (currentUser != null) {
            model.addAttribute("username", currentUser.getUsername());
        }
        return "home";
    }
}
