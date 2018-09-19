package com.ajouict.inhousekitchen.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foods")
public class FoodController {

    @GetMapping("/detail")
    public String detail(){
        System.out.println("디테일 통과");
        return "detail";
    }

    @GetMapping("/list")
    public String list(){
        System.out.println("리스트 통과");
        return "list";
    }

}
