package com.lw.java.runnable;

public class RunningMan implements Runnable {

    private String name;

    public RunningMan() {}

    public RunningMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(this.getName() + "跑到第" + i +"米了！");
        }
    }


}
