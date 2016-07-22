package apkmarvel.daggersample.model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;



/*@Module for the classes whose methods provide dependencies*/
@Module
public class VehicleModule {
    /*@Provides for the methods within @Module classes*/
    /*@Singleton annotation indicates that there will be only one instance of the object.*/
    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}