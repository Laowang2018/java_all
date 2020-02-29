package com.lw.java.threadpattern.p1;

public class PrintClass extends Thread {
    private String message;
    public PrintClass(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i=0; i<1000; i++) {
            System.out.print(message);
        }
    }
}
