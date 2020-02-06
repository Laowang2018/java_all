package com.lw.java.thread.system12306;

/**
 * Ticket pojo javabean
 * 没有任何的逻辑
 * 小容器
 * 一个对象包含很多属性
 * 符合面向对象的思想，可读性更高
 */
public class Ticket {

    private String start;//起点
    private String end;//终点
    private Float price;//价格  大写的Float更好更安全,小写的float不支持从数据库中读出来的null；如果属性是基本类型，要写基本类型的包装类

    public Ticket() {}

    public Ticket(String start, String end, Float price) {
        this.start = start;
        this.end = end;
        this.price = price;

    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


}
