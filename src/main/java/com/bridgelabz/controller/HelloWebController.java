package com.bridgelabz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Purpose: Class is implemented for handling the request from the user
 *
 * @author : SREELIPTA
 * @since 01-12-2021
 */

@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message",
                "This is a custom message Hello from Bridgelabz");
        return "message";
    }
}
