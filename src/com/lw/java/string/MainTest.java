package com.lw.java.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("sdf");
        list.add("sdf");
        list.add("sdf");
        list.add("sdf");
        System.out.println(list);
        Set<String> set = new HashSet<String>();
        set.add("1234");
        set.add("222");
        set.add("333");
        int[] array = new int[]{1,2,3};
        System.out.println(array);
    }
}
