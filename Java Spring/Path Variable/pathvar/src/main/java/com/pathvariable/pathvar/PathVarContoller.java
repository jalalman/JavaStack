package com.pathvariable.pathvar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

;


@RestController
@RequestMapping("/dakikichi")
public class PathVarContoller {
    @RequestMapping("/travel/{place}")
    public String showLink(@PathVariable("place") String place) {
        
        return "congrats! You will soon travel  to "+ place;
    }
    @RequestMapping("/lotto/{num}")
    public String lottoMethod(@PathVariable ("num") int num) {
        if (num%2==0){
            return "You will take a grand journey in the near future but be wary of tempting offers";
        }
        else{
            return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
        }
    }
    
    
}


