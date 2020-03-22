package me.jimmy.springmvc.ioc;

public class MyEvenet {
    private int data;

    private Object source;

    public MyEvenet(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public int getData() {
        return data;
    }
}