package com.memoid.stackovernewbie1.component;

import com.memoid.stackovernewbie1.model.Vehicle;
import com.memoid.stackovernewbie1.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by gmoro on 3/30/2016.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

}
