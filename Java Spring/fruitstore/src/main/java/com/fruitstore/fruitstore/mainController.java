package com.fruitstore.fruitstore;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class mainController {
    @RequestMapping("")
    public String index(Model model) {
        ArrayList<Item> items= new ArrayList<Item>();
        Item i1=new Item("kiwi", 1.5);
        Item i2=new Item("mango", 2.0);
        Item i3=new Item("Goji berries", 4.0);
        Item i4=new Item("Guava", 0.75);
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        model.addAttribute("items",items);
        
        return "index.jsp";
    }
    
}
