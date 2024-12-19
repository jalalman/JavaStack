package com.axsos.savetravels;


import com.axsos.savetravels.model.TravelExp;
import com.axsos.savetravels.service.TravelExpService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class TravelExpController {
    @Autowired
    TravelExpService travelExpService;

    @RequestMapping("/expenses")
    public String index(Model model ,@ModelAttribute TravelExp travelExp) {
        model.addAttribute("travelExps", travelExpService.getAllTravelExp());
        return "index.jsp";
    }
    @PostMapping("/addTravelexp")
    public String addTravelExp(@Valid @ModelAttribute("travelExp") TravelExp travelExp, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("travelExps", travelExpService.getAllTravelExp());
            return "index.jsp";
        }
        else {
            travelExpService.createTravelExp(travelExp);
            return "redirect:/expenses";
        }
    }
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("travelExp",travelExpService.getTravelExpById(id));
        return "editTravelExp.jsp";

    }

    @PostMapping("/editTravelExp")
    public String editTravelExp(@Valid @ModelAttribute("travelExp") TravelExp travelExp, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "editTravelExp.jsp";
        }
        else {
            travelExpService.createTravelExp(travelExp);
            return "redirect:/expenses";
        }
    }

    @RequestMapping("/show/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("travelExp",travelExpService.getTravelExpById(id));
        return "showTravelExp.jsp";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value="id") int id) {
        travelExpService.deleteTravelExp(id);
        return "redirect:/expenses";
    }
}
