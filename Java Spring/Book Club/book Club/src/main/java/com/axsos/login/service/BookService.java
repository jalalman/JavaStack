package com.axsos.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.login.model.Book;
import com.axsos.login.repository.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;


    public List<Book> allBooks(){
        return bookRepo.findAll();
    }
    public void addBook(Book book){
        bookRepo.save(book);
    }

    public void deleteBook(long id){
        bookRepo.deleteById(id);
    }

    public void editBook(Book book){
        bookRepo.save(book);
    }
    public Book getById(long id){
        Optional<Book> optBook=bookRepo.findById(id);
        if(optBook.isPresent()){
            return optBook.get();
        }
        return null;
    }
}
