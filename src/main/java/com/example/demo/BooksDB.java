package com.example.demo;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BooksDB {

    ArrayList<Book> bookList = new ArrayList<>();

    public String saveBook(Book book) {
        for(Book books:bookList){
            if(books.getId() == book.getId()){
                return "Not able to add this";
            }
        }
        bookList.add(book);
        return "Book added Successfully";
    }

    public List<Book> getallbook(Book book) {
        return bookList;
    }

    public Book getbookbyid(long id) {
        for(Book book:bookList){
            if(book.getId() == id)
                return book;
        }
        return null;
    }

    public List<Book> updatebook(long id, Book book) {
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getId() == id){
                bookList.get(i).setId(book.getId());
                bookList.get(i).setAuthorname(book.getAuthorname());
                bookList.get(i).setCost(book.getCost());
            }
        }
        return bookList;
    }

    public List<Book> deletebook(long id) {
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getId() == id)
                bookList.remove(i);
        }
        return bookList;
    }
}
