package org.example.library;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private static int totalUsers = 0;
    private String firstName;
    private String lastName;
    private int membershipNumber;
    private String[] borrowedBooks;

    public User(String firstName, String lastName) {
        totalUsers++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipNumber = totalUsers;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public static void setTotalUsers(int totalUsers) {
        User.totalUsers = totalUsers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(int membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return membershipNumber == user.membershipNumber && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Arrays.equals(borrowedBooks, user.borrowedBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, membershipNumber);
        result = 31 * result + Arrays.hashCode(borrowedBooks);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", membershipNumber=" + membershipNumber +
                ", borrowedBooks=" + Arrays.toString(borrowedBooks) +
                '}';
    }
}
