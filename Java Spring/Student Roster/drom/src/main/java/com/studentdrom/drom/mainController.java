package com.studentdrom.drom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentdrom.drom.model.Drom;
import com.studentdrom.drom.model.Student;
import com.studentdrom.drom.service.DromService;
import com.studentdrom.drom.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class mainController {
    @Autowired
    DromService dromService;
    @Autowired
    StudentService studentService;
    @RequestMapping("/droms")
    public String dashboard(Model model){
        model.addAttribute("droms", dromService.getAll());

        return "droms.jsp";
    }
    @RequestMapping("/drom/new")
    public String addDromView(@ModelAttribute("drom")Drom drom){

        return "newdrom.jsp";
    }
    @RequestMapping("/adddrom")
    public String addDrom(@Valid @ModelAttribute("drom")Drom drom,BindingResult result){
        if(result.hasErrors()){
            return "newdrom.jsp";
        }
        dromService.addDrom(drom);
        return "redirect:/drom/new";

    }
    @RequestMapping("/students/new")
    public String addStudentView(@ModelAttribute("student") Student student,Model model){
        model.addAttribute("droms", dromService.getAll());
        return "newstudent.jsp";
    }

    @RequestMapping("/addstudent")
    public String addStudent(@Valid @ModelAttribute("student") Student student,BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("droms", dromService.getAll());
            return "newstudent.jsp";
    }
    studentService.addStudent(student);
    return "redirect:/students/new";
}

    @RequestMapping("/drom/{id}")
    public String dromViewStudents(@PathVariable("id")long id ,Model model ,@ModelAttribute("student")Student student){

      model.addAttribute("drom", dromService.findDromById(id));
      model.addAttribute("students", studentService.excludeById(id));
      return "showdromstudents.jsp";
    }

    @RequestMapping("/delete/{dromId}/{id}")
    public String deleteStudents(@PathVariable("id")long id ,@PathVariable("dromId")long dromId,Model model){
        studentService.deleteById(id);
        return "redirect:/drom/{dromId}";
    }
   
}
