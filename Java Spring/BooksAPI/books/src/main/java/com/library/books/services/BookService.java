package com.library.books.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.library.books.models.Book;
import com.library.books.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public void deleteUserById(Long id) {
        bookRepository.deleteById(id);
    }
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Optional<Book> existingBook = bookRepository.findById(id);
        if (existingBook.isPresent()) {
            Book bookToUpdate = existingBook.get();
            bookToUpdate.setTitle(title);
            bookToUpdate.setDescription(desc);
            bookToUpdate.setLanguage(lang);
            bookToUpdate.setNumberOfPages(numOfPages);
            return bookRepository.save(bookToUpdate);
        } else {
            return null;
        }
    }
}