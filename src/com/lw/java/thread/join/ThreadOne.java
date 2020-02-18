package com.lw.java.thread.join;

public class ThreadOne extends Thread {

    @Override
    public void run() {
        System.out.println("Thread one running!");
        Thread two = new ThreadTwo();
        two.start();
        try {
            two.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread one ending!");
    }
}
