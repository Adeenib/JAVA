package com.axsos.updateanddelete.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.updateanddelete.models.Book;
import com.axsos.updateanddelete.services.BookService;

@Controller
public class BookControllers {
private final BookService bookService;
    
    public BookControllers(BookService bookServices) {
	this.bookService = bookServices;
	
}


    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "home.jsp";
    }
    
    
    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "new.jsp";
    }
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    @RequestMapping("/books/{id}")
    public String bookInformation(@PathVariable("id") Long id,Model model) {
    	   Book book = bookService.findBook(id);
    	   model.addAttribute("book", book);
	        return "Book.jsp";
    }
    @RequestMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id,Model model) {
    	
    	Book bookinfo = bookService.findBook(id);
   	    model.addAttribute("bookinfo", bookinfo);
	    return "edit.jsp";
    }
    @RequestMapping("/books/editBook/{id}")
    public String editBook(@PathVariable("id") Long id, @RequestParam(value = "title") String title,
			@RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
			@RequestParam(value = "numberOfPages") Integer numOfPages) {
    	
    	Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
    
    	return "redirect:/books/{id}";
    	
    }
    @RequestMapping("/books/delete/{id}")
    public String deleteBook( @PathVariable("id") Long id) {
    	bookService.deleteBook(id);
    	return "redirect:/books";
    	
    	
    }
}