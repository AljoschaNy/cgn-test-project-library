package org.example.library.book;

import org.example.library.User;

public interface Borrowable {
    void borrow(User user);
    void returnBook();
    boolean isBorrowed();
}
