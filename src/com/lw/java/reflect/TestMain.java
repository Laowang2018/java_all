package com.lw.java.reflect;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        Person p = new Person();
        Class clazz = Person.class;

        int modifiers = clazz.getModifiers();
        System.out.println(modifiers);

        Package packageObj = clazz.getPackage();

        String packageStr = packageObj.getName();

        System.out.println(packageStr);


        ArrayList<String> list = new ArrayList<>();

        Class aClass = list.getClass();

        Class bClass = ArrayList.class;

        Class cClass = null;

        try {
            cClass = Class.forName("java.util.ArrayList");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(aClass);

        Class[] interfaces = aClass.getInterfaces();

        for(Class a : interfaces) {
            System.out.println(a.getName());
        }

    }
}
