package com.furao.visualYard.controller;

import com.furao.visualYard.entity.ShelfEntity;
import com.furao.visualYard.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomePageController {
    @Autowired
    ShelfService shelfService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","zhangsan");
//        return "index";

        return "home";
    }

    @RequestMapping("/vy_view")
    public String vyView(Model model){
        List<ShelfEntity> allShelfList = shelfService.getAllShelfList();
        model.addAttribute("shelfList",allShelfList);
        return "vy/visualYardView";
    }

    @RequestMapping("/vy_edit")
    public String vyEdit(){
        return "vy/visualYardEdit";
    }

}
