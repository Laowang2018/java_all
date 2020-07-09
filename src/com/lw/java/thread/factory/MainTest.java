package com.lw.java.thread.factory;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MainTest {
    public static void main(String[] args) {

        new Thread(new Printer("good!")).start();

//        new Thread(new Printer("bad!")).start();

        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("good!")).start();
        factory.newThread(new Printer("bad")).start();
    }
}
