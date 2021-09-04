package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BooksDB booksDB;

    public String insertBook(@RequestBody Book book){
        return booksDB.saveBook(book);
    }

    public List<Book> getallbook(Book book) {
        return booksDB.getallbook(book);
    }

    public Book getbookbyid(long id) {
        return booksDB.getbookbyid(id);
    }

    public List<Book> updatebook(long id, Book book) {
        return booksDB.updatebook(id,book);
    }

    public List<Book> deletebook(long id) {
        return booksDB.deletebook(id);
    }
}
