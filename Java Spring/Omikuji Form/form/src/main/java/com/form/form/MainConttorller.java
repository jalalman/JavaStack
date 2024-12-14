package com.form.form;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
@RequestMapping("/omikuji")
public class MainConttorller {
    @RequestMapping(value="")
    public String index() {

        return "index.jsp";
    }
    

    @RequestMapping("/show")
    public String showForm(@RequestParam(value="number") String number,
    @RequestParam(value="name") String name,
    @RequestParam(value="hobby") String hobby,
    @RequestParam(value="living") String living,
    @RequestParam(value="sthnice") String sthnice,
    @RequestParam(value="city") String city,
    HttpSession session) {
        
            session.setAttribute("city", city);
            session.setAttribute("name", name);
            session.setAttribute("number", number);
            session.setAttribute("hobby", hobby);
            session.setAttribute("living", living);
            session.setAttribute("sthnice", sthnice);
            return "redirect:/omikuji/allinfo";
     
    }
        
        
    @RequestMapping("/allinfo")
    public String allInfo() {
        return "info.jsp";
    }
    

        
    }

    

