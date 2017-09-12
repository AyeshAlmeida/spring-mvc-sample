package com.springmvc.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(){
        return "home";
    }

    @RequestMapping(value = "/response", method = RequestMethod.GET)
    @ResponseBody
    public String getMessageFromApplication(){
        return "{\"message\":\"Application is up and running.\"}";
    }

    @RequestMapping
    public String getLocalisedPage(){
        return "localised";
    }
}
