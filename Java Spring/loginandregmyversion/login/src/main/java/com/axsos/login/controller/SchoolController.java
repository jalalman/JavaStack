package com.axsos.login.controller;

import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.login.model.LoginUser;
import com.axsos.login.model.StuClass;
import com.axsos.login.model.Student;
import com.axsos.login.model.User;
import com.axsos.login.service.StuClassService;
import com.axsos.login.service.StudentService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class SchoolController {
    @Autowired
    StuClassService stuClassService;
    @Autowired
    StudentService studentService;
    @RequestMapping("/dashboard")
    public String index(@ModelAttribute("student") Student student , @ModelAttribute("class") StuClass stuClass,HttpSession session,@ModelAttribute("newUser")User newUser,Model model, @ModelAttribute("loginUser") LoginUser loguser) {
        if(session.getAttribute("loggedUser") !=null){
            model.addAttribute("classes", stuClassService.getAllClasses());
        model.addAttribute("students", studentService.getAllStudents());
        return "dashboard.jsp";
        }
        else{
            return "redirect:/";
        }
        
    }
    @PostMapping("/classes/new")
    public String createClass(@Valid @ModelAttribute("class") StuClass stuClass, BindingResult result,@ModelAttribute("student") Student student,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("classes", stuClassService.getAllClasses());
            model.addAttribute("students", studentService.getAllStudents());
            return "index.jsp";
        } else {
            stuClassService.createClass(stuClass);
            return "redirect:/dashboard";
        }

    }
    @PostMapping("/students/new")
    public String createStudent(@Valid @ModelAttribute("student") Student student, BindingResult result,@ModelAttribute("class") StuClass stuClass,Model model) {
        if (result.hasErrors()) {

            model.addAttribute("classes", stuClassService.getAllClasses());
            model.addAttribute("students", studentService.getAllStudents());
            return "index.jsp";
        } else {
            studentService.createStudent(student);
            return "redirect:/dashboard";
        }

    }

    @GetMapping("/student/{studentId}")
    public String showStudent(@PathVariable("studentId")long studentId, @ModelAttribute("student") Student student,HttpSession session,Model model) {
        if(session.getAttribute("loggedUser") !=null){
        model.addAttribute("student", studentService.getStudent(studentId));
        model.addAttribute("classes", stuClassService.getAllClasses());
        return "studentprofile.jsp";}
        else{
            return "redirect:/";
        }
    }
    @PostMapping("/student/{studentId}/update")
    public String updateStudent(@PathVariable("studentId")long studentId,@Valid @ModelAttribute("student") Student student, BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("student", studentService.getStudent(studentId));
            model.addAttribute("classes", stuClassService.getAllClasses());
            return "studentprofile.jsp";
        } else {
            studentService.updateStudent(student,studentId);
            return "redirect:/dashboard";
        }

    }
    @GetMapping("/student/{studentId}/delete")
    public String deleteStudent(@PathVariable("studentId")long studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/dashboard";
    }
}
