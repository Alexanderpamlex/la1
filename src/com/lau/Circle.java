package com.lau;

public class Circle {

    private double radius;

    private String color;

    public String toString() { return "Круг радиуса="+radius+"и цвета"+color; }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){return radius * radius * Math.PI;}

}
