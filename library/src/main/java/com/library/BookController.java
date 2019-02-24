package com.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    
    @Autowired
    private RecommendationService recService;

    @RequestMapping(method = RequestMethod.GET, value="/network")
    public List<Map<String, String>> getNetwork() {
    	NetworkClient c = new NetworkClient();
    	return c.getData("156101074X");
        
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.GET, value="/books/title/{title}")
    public List<Book> getBooksByTitle(@PathVariable String title) {
        return bookService.getBooksByTitle(title);
    }

    
    @RequestMapping(method = RequestMethod.GET, value="/books/author/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookService.getBooksByAuthor(author);
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/books/genre/{genre}")
    public List<Book> getBooksByGenre(@PathVariable String genre) {
        return bookService.getBooksByGenre(genre);
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/reco/{title}")
    public List<Book> getRecommendation(@PathVariable String title) {
        return recService.getRecommendation(title);
    }
    
    
    
}
