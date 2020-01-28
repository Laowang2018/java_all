package com.lw.java.runnable;

public class TestMain {

    public static void main(String[] args) {

        RunningMan rm1 = new RunningMan("Laowang");
        RunningMan rm2 = new RunningMan("Xiaowang");
        RunningMan rm3 = new RunningMan("Dawang");

        new Thread(rm1).start();
        new Thread(rm2).start();
        new Thread(rm3).start();
    }

}
