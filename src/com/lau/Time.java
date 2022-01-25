package com.lau;

public class Time {

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time() {
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    private int second;
    private int minute;
    private int hour;

    public int getSecond() {return second;}

    public void setSecond(int second) {this.second = second;}

    public int getMinute() {return minute;}

    public void setMinute(int minute) {this.minute = minute;}

    public int getHour() {return hour;}

    public void setHour(int hour) {this.hour = hour;}

    public String toString() {
        if(  hour < 0 || hour > 23 || minute<0 || minute > 59 || second<0 || second>59 ){
            System.out.println("Error");
            this.second = 0;
            this.minute = 0;
            this.hour = 0;
        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time nextSecond() {

        ++second;

        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return  this;
    }
}


