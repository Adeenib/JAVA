package com.axsos.updateanddelete.services;

import java.util.*;


//...
import org.springframework.stereotype.Service;

import com.axsos.updateanddelete.models.Book;
import com.axsos.updateanddelete.repository.BookRepository;

@Service
public class BookService {

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
public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	   Book book=findBook(id);
	   book.setTitle(title);
	   book.setDescription(desc);
	   book.setLanguage(lang);
	   book.setNumberOfPages(numOfPages);
	   bookRepository.save(book);
	
	return book;
}
public void  deleteBook(long id) {
	
	bookRepository.deleteById(id);
	
}
}
