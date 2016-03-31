package com.memoid.stackovernewbie1.model;

import javax.inject.Inject;

/**
 * Created by gmoro on 3/30/2016.
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }

}
