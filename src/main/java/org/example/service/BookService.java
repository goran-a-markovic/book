package org.example.service;

import org.example.dao.BookDao;
import org.example.dao.DaoFactory;
import org.example.entity.Book;

import java.util.List;
import java.util.Scanner;

public class BookService {

    public static void insertBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the book");
        String name = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        System.out.println("Please enter the description of the book");
        String description = scanner.nextLine();
        System.out.println("Please enter the year of the book");
        int year = scanner.nextInt();
        Book book = new Book(name, author, description, year);
        BookDao bookDao = DaoFactory.getBookDao();
        bookDao.insert(book);
    }

    public static void getBookById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the id of the book");
        int id = scanner.nextInt();
        BookDao bookDao = DaoFactory.getBookDao();
        Book book = bookDao.getBookById(id);
        System.out.println("Here is the book: " + book.toString());
    }

    public static void getAllBooks() {
        System.out.println("All books:");
        BookDao bookDao = DaoFactory.getBookDao();
        List<Book> books = bookDao.getAllBooks();
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public static void updateBook() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("What is the ID of the book you would like to update?");
        int id = scannerInt.nextInt();
        System.out.println("Please enter the name of the book");
        String name = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        System.out.println("Please enter the description of the book");
        String description = scanner.nextLine();
        System.out.println("Please enter the year of the book");
        int year = scannerInt.nextInt();
        Book book = new Book(id, name, author, description, year);
        BookDao bookDao = DaoFactory.getBookDao();
        bookDao.update(book);
    }

    public static void deleteBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the ID of the book you would like to delete?");
        int id = scanner.nextInt();
        BookDao bookDao = DaoFactory.getBookDao();
        bookDao.delete(id);
    }
}
