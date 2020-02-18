package com.lw.java.thread.join;

public class ThreadThree extends Thread {

    private ThreadTwo two;

    public ThreadThree(ThreadTwo two) {
        this.two = two;
    }


    @Override
    public void run() {
        System.out.println("Thread three running!");

        synchronized (two) {
            System.out.println("Thread two is locked!");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread two is unlocking!");
        }

        System.out.println("Thread three ending!");
    }
}
