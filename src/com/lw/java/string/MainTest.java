package com.lw.java.string;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long before = runtime.freeMemory();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<500000; i++) {
            list.add(UUID.randomUUID().toString() + UUID.randomUUID().toString());
        }
        System.out.println(list.size());
        long after = runtime.freeMemory();
        System.out.println((before - after)/1024);

        Random random = new Random();
        Date date = new Date();
        String s = date.getTime() + "" + date.getTime();
        String substring = s.substring(5);
        System.out.println(substring);
        System.out.println(s);

    }
}
