package com.axsos.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.login.model.Book;
import com.axsos.login.model.LoginUser;
import com.axsos.login.model.User;
import com.axsos.login.repository.BookRepo;
import com.axsos.login.service.BookService;
import com.axsos.login.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookClubController {
    @Autowired
    BookService bookService;
    @Autowired
    UserService userService;
@RequestMapping("/home")
public String home(Model model,HttpSession session){
    if(session.getAttribute("loggedUser") !=null)
    {
        model.addAttribute("books", bookService.allBooks());
    return "home.jsp";}
    else{
        return "redirect:/";
    }
}
@RequestMapping("/books/new")
public String newBookView(@ModelAttribute("book")Book book,Model model,HttpSession session){
    if(session.getAttribute("loggedUser")!= null){
        session.getAttribute("loggedUser");
        return "newbook.jsp";
    }
    else{
        return "redirect:/";
    }
}

@PostMapping("/books/addbook")
public String newBook(@Valid @ModelAttribute("book")Book book,BindingResult result,Model model,HttpSession session){
    if(result.hasErrors()){
        return "newbook.jsp";
    }
    else{
        User loggUser = (User) session.getAttribute("loggedUser");
        book.setUser(loggUser);
        bookService.addBook(book);
        return "redirect:/home";
    }
}
@GetMapping("/books/{id}")
public String bookinfo(@PathVariable("id")long id ,Model model,HttpSession session){
    if(session.getAttribute("loggedUser") !=null){
        model.addAttribute("book", bookService.getById(id));
        return "Bookinfo.jsp";
    }
    else{
        return "index.jsp";
    }
}
@RequestMapping("/books/delete/{id}")
public String deleteBook(@PathVariable("id")long id,Model model,HttpSession session){
    if(session.getAttribute("loggedUser")==null){
        return "index.jsp";
    }
    else{

        bookService.deleteBook(id);

        return "redirect:/home";
    }
}
}
