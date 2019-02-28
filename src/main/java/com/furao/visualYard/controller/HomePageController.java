package com.furao.visualYard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","zhangsan");
//        return "index";
        return "home";
    }

    @RequestMapping("/vy_view")
    public String vyView(){
        return "vy/visualYardView";
    }

    @RequestMapping("/vy_edit")
    public String vyEdit(){
        return "vy/visualYardEdit";
    }

}
