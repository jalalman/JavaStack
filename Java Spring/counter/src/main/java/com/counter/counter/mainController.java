package com.counter.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;




@Controller
@RequestMapping("")
public class mainController {
    @RequestMapping("/counter")
    public String counter() {
        return "counter.jsp";
    }
    
    @RequestMapping("")
    public String index(HttpSession session) {
        if (session.getAttribute("count")== null){
            session.setAttribute("count", 0);
        }
        else{
            
            int count =(Integer) session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        }

        return "index.jsp";
    }

    @RequestMapping("/counter2")
    public String counter2(HttpSession session) {
        if (session.getAttribute("count")== null){
            session.setAttribute("count", 0);
        }
        else{
            
            int count =(Integer) session.getAttribute("count");
            count+=2;
            session.setAttribute("count", count-1);
        }

        return "counter2.jsp";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session) {
        session.removeAttribute("count");
        return "redirect:/";
    }
    
    
}
