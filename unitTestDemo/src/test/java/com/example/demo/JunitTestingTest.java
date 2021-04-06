package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTestingTest {

    @Test
    void squareTest() {
        JunitTesting jUnit=new JunitTesting();
        assertEquals(36,jUnit.square(6));
    }

    @Test
    void countATest() {
        JunitTesting jUnit=new JunitTesting();
        assertEquals(4,jUnit.countA("aaaa"));
    }
}