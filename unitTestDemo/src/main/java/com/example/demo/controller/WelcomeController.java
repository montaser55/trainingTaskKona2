package com.example.demo.controller;

import com.example.demo.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {


    private WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService=welcomeService;
    }

    @GetMapping(path = "/welcome")
    public @ResponseBody String welcome(@RequestParam(name = "name",defaultValue = "Stranger") String name){
        return welcomeService.getWelcomeMessage(name);
    }
}
