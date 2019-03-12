package com.furao.visualYard.controller;

import com.furao.visualYard.entity.ResponseInfo;
import com.furao.visualYard.entity.ShelfEntity;
import com.furao.visualYard.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/shelf")
public class ShelfController {

    @Autowired
    ShelfService shelfService;

    @RequestMapping("/shelfManage")
    public String shelfView(Model model){
        List<ShelfEntity> allShelfList = shelfService.getAllShelfList();
        model.addAttribute("shelfList",allShelfList);
        return "baseData/shelfView";
    }


    @RequestMapping("/addShelf")
    @ResponseBody
    public ResponseInfo addShelf(ShelfEntity shelfEntity){
        ResponseInfo responseInfo = new ResponseInfo();
        boolean flag = shelfService.addShelfs(shelfEntity);
        responseInfo.setResult(shelfEntity);
        responseInfo.setFlag(1);
        responseInfo.setMessage("success");
        return responseInfo;
    }

}
