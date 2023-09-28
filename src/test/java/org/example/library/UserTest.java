package org.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getMembershipNumber_whenTwoInstancesOfClassUserCreated_thenReturn2() {
        //GIVEN
        User user1 = new User("test1","testtest1");
        User user2 = new User("test2","testtest2");

        //WHEN
        int actual = User.getTotalUsers();
        int expect = 2;
        //THEN
        assertEquals(expect,actual);
    }

}