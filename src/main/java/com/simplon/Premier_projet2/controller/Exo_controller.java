package com.simplon.Premier_projet2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exo_controller {
    @ResponseBody
    @RequestMapping(path = "/monexo")
    public String getExo() {
        System.out.println("Mon exo Get Spring");
        return " Mon Exo Get Walks";

    }

}
