package apkmarvel.daggersample.model;

import javax.inject.Inject;

/*Vehicle is the dependent class*/
public class Vehicle {
    private Motor motor;

    /*@Inject to request a dependency (a constructor, a field, or a method)*/
    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }
    public void increaseSpeed(int value){
        motor.accelerate(value);
    }
 
    public void stop(){
        motor.brake();
    }
 
    public int getSpeed(){
        return motor.getRpm();
    }
}