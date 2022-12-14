package com.simplon.Premier_projet2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MonController {
    @ResponseBody
    @RequestMapping(path = "/maroute")
            public String getHome(){
        System.out.println("Bonjour");
        return "";
    }




}
