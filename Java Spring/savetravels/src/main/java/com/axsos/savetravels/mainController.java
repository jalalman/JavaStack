package com.axsos.savetravels;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mainController {
    @RequestMapping("")
    public String index() {
        return "index.jsp";
    }
}
