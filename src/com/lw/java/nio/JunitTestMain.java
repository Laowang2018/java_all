package com.lw.java.nio;

import java.nio.ByteBuffer;

public class JunitTestMain {
    public static void main(String[] args) {
//        testOne();\
        testTwo();
    }
    public static void testOne() {
        byte[] byteArray = new byte[]{3,4,5,6,7,8};
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.position(8);
        System.out.println(buffer);
        buffer.put(byteArray);
    }
    public static void testTwo() {
        byte[] byteArray = new byte[]{1,2,3,4,5};
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.position(1);
        buffer.put(byteArray);
        byte[] newArray = buffer.array();
        for (int i=0; i<newArray.length; i++) {
            System.out.print(newArray[i]);
        }
        System.out.println();
        System.out.println(buffer.remaining());
    }
}
