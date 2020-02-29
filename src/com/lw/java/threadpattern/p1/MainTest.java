package com.lw.java.threadpattern.p1;

public class MainTest {
    public static void main(String[] args) {
        new PrintClass("*").start();
        new PrintClass("+").start();
    }
}
