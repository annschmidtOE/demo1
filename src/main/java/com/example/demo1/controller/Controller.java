package com.example.demo1.controller;

import com.example.demo1.repository.DbRepository;
import com.example.demo1.repository.IReposiroty;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    private IReposiroty repository = new DbRepository();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("students",repository.getAll());
        return "index";
    }



}
