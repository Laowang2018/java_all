package com.lw.java.collection;

import java.util.HashSet;
import java.util.Random;
import java.util.UUID;

public class HashSetTest {
    public static void main(String[] args) {
        Random random = new Random(46);
        HashSet<Integer> integers = new HashSet<>();
        for(int i=0; i<100; i++) {
            integers.add(random.nextInt(30));
        }
        System.out.println(integers);

        HashSet<String> strs = new HashSet<>();
        for(int i=10; i>0; i--) {
            strs.add(UUID.randomUUID().toString().replace("-", ""));
        }
        for(String str : strs) {
            System.out.print(str.hashCode() + ",");
        }


    }
}
