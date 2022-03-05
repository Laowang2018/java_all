package com.lw.java.collection;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        final ListIterator<String> stringListIterator = list.listIterator();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        list.add("4444");
        list.add("5555");
        list.add(5, "6666");
        System.out.println(list);
//        list.remove(3);

        List<String> strings = list.subList(1, 6);
        System.out.println(strings);
        System.out.println(list.containsAll(strings));
        System.out.println(strings.retainAll(list));
        boolean b = list.removeAll(strings);
        System.out.println(b);
        System.out.println(list);
    }
}
