package org.example;

import org.example.library.User;
import org.example.library.book.Book;
import org.example.library.book.Novel;
import org.example.library.book.SpecialistBook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Aljoscha","Nyang");
        User user2 = new User("Fabian", "Link");
        User user3 = new User("Iskren", "Radev");

        Novel book1 = new Novel("Der Steppenwolf", "Hermann Hesse", "978-3-596-90078-9","Roman, Philosophie" );
        Novel book2 = new Novel("Die Verwandlung", "Franz Kafka", "978-3-596-90400-8", "Novelle, Existenzialismus");
        Novel book3 = new Novel("Im Westen nichts Neues", "Erich Maria Remarque", "978-3-499-22755-5", "Kriegsroman");
        Novel book4 = new Novel("Der Vorleser", "Bernhard Schlink", "978-3-442-31056-7", "Zeitgeschichtlicher Roman");
        Novel book5 = new Novel("Das Parfum", "Patrick Süskind", "978-3-257-23028-4", "Historischer Roman, Kriminalroman");

        SpecialistBook specialBook1 = new SpecialistBook(
                "Effective Java",
                "Joshua Bloch",
                "978-0-13-468599-1",
                "Java-Programmierung, Best Practices",
                "Fortgeschritten"
        );

        Book book12 = new Book("Der Steppenwolf", "Hermann Hesse", "978-3-596-90078-9");
        Book book13 = new Book("Der ", "Hermann Hesse", "978-3-596-90078-9");
        Book book14 = new Book("Im Westen nichts Neues", "Erich Maria Remarque", "978-3-499-22755-5");

        book12.borrow(user1);
        book13.borrow(user1);
        book14.borrow(user1);
        System.out.println(Arrays.toString(user1.getBorrowedBooks()));


        //System.out.println(book1);
        //System.out.println(specialBook1);
    }
}