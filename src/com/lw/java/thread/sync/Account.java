package com.lw.java.thread.sync;

public class Account {
    private Double money;
    private String name;
    public Account( String name, Double money) {
        this.money = money;
        this.name = name;
    }

    /**
     * deposit 和 withdraw方法都加了锁，且在一个Account对象上只有一个对象锁，所以这两个方法是相互线程安全的
     * 两个方法不能被不同的线程同时执行，只有哪个线程先获得锁对象才能执行这两个方法中的一个
     * 无论何时获取锁的线程只能有一个，synchrnoized方法一次只能被一个线程执行（这里的锁就是Account的某个具体的对象）
     * @param mon
     */

    public synchronized void deposit(Double mon) {
        money += mon;
    }

    public synchronized boolean withdraw(Double nom) {
        if (money >= nom) {
            money -= nom;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

}

