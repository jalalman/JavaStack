package com.simplerec.simplerecpit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RescController {
    @RequestMapping("")
    public String index(Model model) {
        String name="Jalal Hemmo";
        String itemName="earphones";
        double price=5.25;
        String desc="very nice earphone you should buy";
        String vendor="Apple";
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("desc", desc);
        model.addAttribute("vendor", vendor);
        return "index.jsp";
    }
    
}
