package com.simplon.Premier_projet2.controller;


import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class Exo2_console {
    @ResponseBody
    @RequestMapping(path="/exo2")
    public String exo2(){
        System.out.println(" Exo 2");
        return " Exo 2 marche";
    }

    @ResponseBody

    @RequestMapping(path="/exo3")
    public String exo3(){
        System.out.println(" Exo 3");
        return " Exo 3 marche";
    }

    @RequestMapping(path="/exo4")
    @ResponseBody
    public String exo4(@RequestParam String id){
        System.out.println(" Exo 4");
        return "ID: "+ id;
    }

    @RequestMapping(path="/exo5")
    @ResponseBody
    public String exo5(@RequestParam String id){
        System.out.println(" Exo 5");
        return "ID: "+ id;
    }

    @RequestMapping(path="/exo7")
    @ResponseBody
    public List<String> exo7(){
        List<String> maListe = new ArrayList<>();
        maListe.add("Valeur 2");
        maListe.add("Valeur 3");
        maListe.add("Valeur 4");
        maListe.add("The Last");
        return maListe;
    }

    @RequestMapping(path="/exo8")
    @ResponseBody
    public String afficherDate(Model model) {
        model.addAttribute("now", new Date());

        return "affichageDate";
    }

    @RequestMapping(path="/exo9")
    @ResponseBody
    public String afficherLaDate() {
        Date myDate = new Date();
        String myString = DateFormat.getDateInstance().format(myDate);

        return myString;

    }





}
