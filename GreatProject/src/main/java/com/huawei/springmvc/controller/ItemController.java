package com.huawei.springmvc.controller;

import com.huawei.dao.Items;
import com.huawei.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemController {
    /*@Autowired
    private ItemService itemService;

    @RequestMapping("/itemList.action")
    public ModelAndView getItemList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Items> itemsList = itemService.getItemsList();
        modelAndView.addObject("itemList",itemsList);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }*/
}
