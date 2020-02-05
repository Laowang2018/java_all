package com.lw.java.system12306;

import java.util.Vector;

public class System12306 {


    private System12306() {}

    private static System12306 system = new System12306();

    public static System12306 getInstance() {
        return system;
    }

    //Vector本身是线程安全的，所以不用再考虑线程安全问题
    private Vector<Ticket> tickets = new Vector<>();

    {
        for (int i=0; i<100; i++) {
            tickets.add(new Ticket("北京", "深圳", i%10 + 55F));
        }
    }

    //从集合内获取一张车票
    public Ticket getTicket() {
        try {
            return tickets.remove(0);
        } catch (Exception e) {
            return null;
        }
    }

}
