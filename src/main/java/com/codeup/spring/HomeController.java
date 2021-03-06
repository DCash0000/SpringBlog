package com.codeup.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String landing() {
        return "This is the Landing!";
    }

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }



}
