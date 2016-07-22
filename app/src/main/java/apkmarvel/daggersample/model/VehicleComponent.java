package apkmarvel.daggersample.model;

import javax.inject.Singleton;

import dagger.Component;


/*@Component is a bridge interface between modules and injection*/
/*If you need to use more modules, then just add them using a comma as a separator.*/
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}