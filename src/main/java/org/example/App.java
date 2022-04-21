package org.example;

import org.example.service.BookService;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Select your option: ");
            System.out.println("1: Insert book ");
            System.out.println("2: Get book ");
            System.out.println("3: Get all books ");
            System.out.println("4: Update a book ");
            System.out.println("5: Delete a book ");
            System.out.println("6: Quit ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BookService.insertBook();
                    break;
                case 2:
                    BookService.getBookById();
                    break;
                case 3:
                    BookService.getAllBooks();
                    break;
                case 4:
                    BookService.updateBook();
                    break;
                case 5:
                    BookService.deleteBook();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter 1-5");
            }

        }
    }
}
