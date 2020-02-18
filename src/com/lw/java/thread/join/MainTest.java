package com.lw.java.thread.join;

public class MainTest {
    public static void main(String[] args) {

        /**
         * 线程one启动，在one中启动线程two, 线程two join到线程one中执行2000，线程two执行的时候开启线程three
         * 线程three内部锁定了two对象 10000，然后，线程2执行了2000，因为two对象被锁，所以直到three不在锁定two,one和three才能执行完成
         */
        new ThreadOne().start();


    }
}
