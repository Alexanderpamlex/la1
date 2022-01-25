package com.lau;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        Circle c1 = new Circle();
        c1.setRadius(2.0);
        c1.setColor("красный");
        System.out.println("Цвет-"+c1.getColor()+ "\nРадиус-"+c1.getRadius()+ "\nПлощадь-"+c1.getArea());
        */
        Time t1 = new Time(1,2,3);
        System.out.println(t1);
        t1.setHour(11);
        t1.setMinute(22);
        t1.setSecond(33);
        System.out.println(t1);
        t1.setTime(-1,59,23);
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());












    }
}
