package org.example.library.book;

import org.junit.jupiter.api.Test;

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

}