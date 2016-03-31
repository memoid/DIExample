package com.memoid.stackovernewbie1.module;

import com.memoid.stackovernewbie1.model.Motor;
import com.memoid.stackovernewbie1.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gmoro on 3/30/2016.
 */
@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }

}
