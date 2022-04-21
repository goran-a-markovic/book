package org.example.dao;

import org.example.entity.Book;

import java.util.List;

public interface BookDao {

    public void insert(Book book);
    public Book getBookById(int id);
    public List<Book> getAllBooks();
    public void update(Book book);
    public void delete(int id);
}
