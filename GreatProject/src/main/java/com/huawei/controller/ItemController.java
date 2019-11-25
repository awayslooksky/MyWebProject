package com.huawei.controller;

import com.huawei.dao.Items;
import com.huawei.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/itemList.action")
    public ModelAndView getItemList() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<Items> itemsList = itemService.getItemsList();
        modelAndView.addObject("itemList",itemsList);
        modelAndView.setViewName("itemList");
        //获取列表数据
       /* List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items(1,"笔记本",3500,"惠普的","不懂呀",new Date()));*/
        //将列表数据添加到modelAndView中，等同于设置到request域中
        modelAndView.addObject("itemList", itemsList);
        return modelAndView;
    }
}
