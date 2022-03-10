package com.lw.java.collection;

import java.util.HashSet;
import java.util.Random;

public class HashSetTest {
    public static void main(String[] args) {
        Random random = new Random(46);
        HashSet<Integer> integers = new HashSet<>();
        for(int i=0; i<100; i++) {
            integers.add(random.nextInt(30));
        }
        System.out.println(integers.toString());


        Integer integer = new Integer(10000);
        System.out.println(integer.hashCode());
    }
}
