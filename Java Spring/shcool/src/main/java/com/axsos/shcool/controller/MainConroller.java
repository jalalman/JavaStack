package com.axsos.shcool.controller;

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

import com.axsos.shcool.model.StuClass;
import com.axsos.shcool.model.Student;
import com.axsos.shcool.service.StuClassService;
import com.axsos.shcool.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class MainConroller {
    @Autowired
    StuClassService stuClassService;
    @Autowired
    StudentService studentService;
    @RequestMapping("/")
    public String index(@ModelAttribute("student") Student student , @ModelAttribute("class") StuClass stuClass,Model model) {
        model.addAttribute("classes", stuClassService.getAllClasses());
        model.addAttribute("students", studentService.getAllStudents());
        return "index.jsp";
    }
    @PostMapping("/classes/new")
    public String createClass(@Valid @ModelAttribute("class") StuClass stuClass, BindingResult result,@ModelAttribute("student") Student student,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("classes", stuClassService.getAllClasses());
            model.addAttribute("students", studentService.getAllStudents());
            return "index.jsp";
        } else {
            stuClassService.createClass(stuClass);
            return "redirect:/";
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
            return "redirect:/";
        }

    }

    @GetMapping("/student/{studentId}")
    public String showStudent(@PathVariable("studentId")long studentId, @ModelAttribute("student") Student student,Model model) {
        model.addAttribute("student", studentService.getStudent(studentId));
        model.addAttribute("classes", stuClassService.getAllClasses());
        return "studentprofile.jsp";
    }
    @PostMapping("/student/{studentId}/update")
    public String updateStudent(@PathVariable("studentId")long studentId,@Valid @ModelAttribute("student") Student student, BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("student", studentService.getStudent(studentId));
            model.addAttribute("classes", stuClassService.getAllClasses());
            return "studentprofile.jsp";
        } else {
            studentService.updateStudent(student,studentId);
            return "redirect:/";
        }

    }
    @GetMapping("/student/{studentId}/delete")
    public String deleteStudent(@PathVariable("studentId")long studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/";
    }
}
