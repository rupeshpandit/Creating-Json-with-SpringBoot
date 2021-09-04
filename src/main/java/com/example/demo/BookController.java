package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @ApiOperation("Insert into Api")
    @PostMapping("/insertbook")
    public String insertdata(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    @GetMapping("/getallbook")
    public List<Book> getallbook(@RequestBody Book book){
        return bookService.getallbook(book);
    }

    @GetMapping("/getbookbyid/{id}")
    public Book getbookbyid(@PathVariable long id){
        return bookService.getbookbyid(id);
    }

    @RequestMapping(value = "/updatebook/{id}",method = RequestMethod.PUT)
    public List<Book> updatebook(@PathVariable long id,@RequestBody Book book){
        return bookService.updatebook(id,book);
    }

    @RequestMapping(value = "/deletebook/{id}",method = RequestMethod.DELETE)
    public List<Book> deletebook(@PathVariable long id){
        return bookService.deletebook(id);
    }

}
