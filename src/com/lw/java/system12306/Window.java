package com.lw.java.system12306;

public class Window extends Thread {

    private String windowName; //区别窗口

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }

    public Window(String windowName) {
        this.windowName = windowName;
    }

    public void run() {
       sellTickets();
    }

    public void sellTickets() {
        while (true) {
            System12306 system12306 = System12306.getInstance();
            Ticket ticket = system12306.getTicket();
            if(ticket == null) {
                System.out.println("对不起 " + getWindowName() + " 当前窗口车票已售完！");
                break;
            }
            System.out.println("从 " + getWindowName() + " 卖出了一张车票！\n"
                    + ticket.getStart() + "----->" + ticket.getEnd() + "\n\t" + ticket.getPrice() + "元");
        }
    }

}
