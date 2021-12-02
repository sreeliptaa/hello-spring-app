package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose: Class is implemented for handling the request from the user
 * @RestController defines that it will deal with the rest controller
 * @RequestMapping will handle the request
 *
 * @author : SREELIPTA
 * @since 01-12-2021
 */

@RestController
public class HelloRestController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello from Bridgelabz!";
    }
}
