package com.hellohuman.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/")
public class HelloHumanController {




    @RequestMapping(value = "", method=RequestMethod.GET)
    public String printNameAndTimes(
    @RequestParam(value = "name",defaultValue = "human",required = false) String name,
    @RequestParam (value = "times",required = false ,defaultValue = "1") int times,
    @RequestParam(value = "lName",required = false,defaultValue = "") String lName
     ) {
        return new String("Hello "+name+" "+lName+" ").repeat(times);
    }



}
