package com.lw.java.thread;

public class TestMain {

    public static void main(String[] args) {

        RunningMan rm1 = new RunningMan("Laowang");
        RunningMan rm2 = new RunningMan("Xiaowang");
        RunningMan rm3 = new RunningMan("Dawang");
        rm1.start();
        rm2.start();
        rm3.start();

    }

}
