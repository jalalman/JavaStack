package com.ninjagold.ninjagold;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class MainController {
    private static final Random random = new Random();
    
    @GetMapping("")
    public String ninjaGold(HttpSession session, Model model) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("tries", 10);
            session.setAttribute("messages", new ArrayList<String>());
        }
       
        model.addAttribute("gold", session.getAttribute("gold"));
        model.addAttribute("tries", session.getAttribute("tries"));
        model.addAttribute("messages", session.getAttribute("messages"));
        return "index.jsp";
    }
   
    @PostMapping("/process_money")
    public String processMoney(HttpSession session, @RequestParam String place) {
        // Check if tries remain
        Integer tries = (Integer) session.getAttribute("tries");
        if (tries > 0) {
            int goldEarned = 0;
            String message;
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy h:mm:ss a");
            String formattedDateTime = currentTime.format(formatter);
            // Calculate gold based on activity
            switch (place) {
                case "farm":
                    goldEarned = random.nextInt(11) + 10; // 10-20
                    message = String.format("Earned %d gold from the farm!", goldEarned);
                    break;
                case "cave":
                    goldEarned = random.nextInt(6) + 5; // 5-10
                    message = String.format("Earned %d gold from the cave!", goldEarned);
                    break;
                case "house":
                    goldEarned = random.nextInt(4) + 2; // 2-5
                    message = String.format("Earned %d gold from the house!", goldEarned);
                    break;
                case "quest":
                    goldEarned = random.nextInt(101) - 50; // -50 to 50
                    if (goldEarned >= 0) {
                        message = String.format("Entered a quest and won %d gold!", goldEarned);
                    } else {
                        message = String.format("Entered a quest and lost %d gold... Ouch...", Math.abs(goldEarned));
                    }
                    break;
                default:
                    return "redirect:/";
            }
            
            Integer currentGold = (Integer) session.getAttribute("gold");
            session.setAttribute("gold", currentGold + goldEarned);
            session.setAttribute("tries", tries - 1);

            
            // Prepare message with color class
            List<String> messages = (List<String>) session.getAttribute("messages");
            String colorClass = goldEarned >= 0 ? "green" : "red";
            messages.add(0, String.format("<li class='%s'>%s (%s)</li> <br> ",colorClass, message,formattedDateTime ));
        }
        return "redirect:/";
    }
    @GetMapping("/reset")
    public String reset(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}