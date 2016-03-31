package com.memoid.stackovernewbie1.model;

/**
 * Created by gmoro on 3/30/2016.
 */
public class Motor {

    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm += value;
    }

    public void brake() {
        rpm = 0;
    }

}
