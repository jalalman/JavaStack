package com.routes.routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/daikchi")
public class DaikchiController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String index() {
        return new String("Welcome!");
    }
    @RequestMapping(value="/today", method=RequestMethod.GET)
    public String today(){
        return new String("Today you will find luck in all your endeavors!");
    }
    @RequestMapping(value="/tomorrow", method=RequestMethod.GET)
    public String requestMethodName() {
        return new String("Tomorrow, an opportunity will arise, so be sure to be open to new ideas!");
    }


}
