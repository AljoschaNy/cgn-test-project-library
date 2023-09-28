package org.example.library.book;

import org.example.library.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getTotalBooks_when2InstancesOfBookBeenCreated_thenReturn2() {
        //GIVEN
        Book book1 = new Book("title1","author1","isbn1");
        Book book2 = new Book("title1","author1","isbn1");

        //WHEN
        int actual = Book.getTotalBooks();
        int expect = 2;
        //THEN
        assertEquals(expect,actual);
    }

    @Test
    void getTotalBooks_when2InstancesOfNovelBeenCreated_thenReturn2() {
        //GIVEN
        Novel book1 = new Novel("title1","author1","isbn1","genre1");
        Novel book2 = new Novel("title1","author1","isbn1","genre2");
        //WHEN
        int actual = Book.getTotalBooks();
        //THEN
        assertTrue(actual == 2);
    }

    @Test
    void getTotalBooks_when2InstancesOfSpecialistBookBeenCreated_thenReturn2() {
        //GIVEN
        SpecialistBook book1 = new SpecialistBook("title1","author1","isbn1","field1","junior");
        SpecialistBook book2 = new SpecialistBook("title1","author1","isbn1","field2","junior");
        //WHEN
        int actual = Book.getTotalBooks();
        //THEN
        assertTrue(actual == 2);
    }

    @Test
    void borrow_whenBorrowMethodIsExecutedOnInstanceOfBook_thenThisInstanceIsIncludedInUsersArrayBorrowedBooks() {
        //GIVEN
        Book book1 = new Book("title1","author1","isbn1");
        Book book2 = new Book("title2","author1","isbn1");
        User user = new User("Test", "User");
        book1.borrow(user);
        book2.borrow(user);

        //WHEN
        String[] actual = user.getBorrowedBooks();
        //THEN
        String[] expect = {"title1","title2",null,null,null};
        assertTrue(Arrays.equals(actual, expect));
    }

}