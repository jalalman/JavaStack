package com.relations.onetomany;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.relations.onetomany.model.Ninja;
import com.relations.onetomany.model.Dojo;
import com.relations.onetomany.repository.NinjaRepository;
import com.relations.onetomany.service.NinjaService;
import com.relations.onetomany.service.DojoService;


import jakarta.validation.Valid;

@Controller
public class mainController {
    @Autowired
    DojoService dojoService;

   @Autowired
   NinjaService ninjaService;

   @RequestMapping("/ninja")
    public String ninja(Model model, @ModelAttribute("ninja") Ninja ninja){
        model.addAttribute("dojos",dojoService.getAll());
        // model.addAttribute("car", new Car());
        return "ninja.jsp";
    }
 @PostMapping("/addninja")
    public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja,
                        BindingResult result,
                        Model model) {
        if (result.hasErrors()) {
            // Add the users list back to the model if validation fails
            model.addAttribute("dojos", dojoService.getAll());
            return "ninja.jsp";  // Return to car.jsp, not index.jsp
        }


      ninjaService.create(ninja);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String index(@ModelAttribute("dojo") Dojo dojo ,Model model){
        return "index.jsp";
    }
    @PostMapping("/adddojo")
    public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult result,Model model){
    if(result.hasErrors()){
        return "index.jsp";
    }
    dojoService.addDojo(dojo);
    return "redirect:/";
}
@RequestMapping("/dojos/{id}")
public String showNinjas(@PathVariable Long id , Model model){
    Dojo dojo =dojoService.getDojoById(id);
    model.addAttribute("dojo", dojo);

    return "showDojo.jsp";

}
}
