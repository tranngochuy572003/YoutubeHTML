package com.example.demo.controller;

import com.example.demo.Entity.User;
import com.example.demo.service.HomeService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/register")
    public String register() {
        return "form_register";
    }
    @PostMapping("/confirmRegisterSuccess")
    @ResponseBody
    public User confirmRegisterSuccess(@RequestBody User user) throws BadRequestException {
        homeService.register(user);
        return user;
    }

    @PostMapping("/getInfo")
    public String getInfo(Model model,@RequestBody User user) {
        model.addAttribute("user",user);
        return "success_message";
    }
}
