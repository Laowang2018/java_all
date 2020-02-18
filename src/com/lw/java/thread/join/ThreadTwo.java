package com.lw.java.thread.join;

public class ThreadTwo extends Thread {


    @Override
    public void run() {

        System.out.println("Thread two running!");
        ThreadThree three = new ThreadThree(this);
        three.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread two ending!");
    }
}
