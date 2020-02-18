package com.lw.java.thread.join;

public class ThreadTwo extends Thread {
    @Override
    public void run() {

        System.out.println("Thread two running!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread two ending!");
    }
}
