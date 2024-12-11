package com.display.display;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

@Controller
@RequestMapping("/")
public class mainController {
    @RequestMapping(value = "", method=RequestMethod.GET)
    public String index() {
        return  "index.jsp";
    }
    
    @RequestMapping(value = "/time", method=RequestMethod.GET)
    public String time(Model model) {
        LocalDateTime date = LocalDateTime.now();  
        DateTimeFormatter dateFromat = DateTimeFormatter.ofPattern("hh:mm a");  
        String fromtedDAte= date.format(dateFromat);
        model.addAttribute("time", fromtedDAte);
                return "time.jsp";
    }
    @RequestMapping(value = "/date", method=RequestMethod.GET)
    public String date(Model model) {
        LocalDateTime date = LocalDateTime.now();  
        DateTimeFormatter dateFromat = DateTimeFormatter.ofPattern("dd-MMM-yyyy ");  
        String fromtedDAte= date.format(dateFromat);
        model.addAttribute("date", fromtedDAte);
        return "date.jsp";
    }
    
}
