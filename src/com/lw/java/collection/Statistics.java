package com.lw.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<10000; i++) {
            int r = random.nextInt(20);
            Integer val = map.get(r);
            map.put(r, val==null ? 1 : val+1);
        }
        System.out.println(map);
    }
}
