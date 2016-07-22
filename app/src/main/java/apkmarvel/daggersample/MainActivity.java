package apkmarvel.daggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import apkmarvel.daggersample.model.DaggerVehicleComponent;
import apkmarvel.daggersample.model.Vehicle;
import apkmarvel.daggersample.model.VehicleComponent;
import apkmarvel.daggersample.model.VehicleModule;

/*credit http://code.tutsplus.com/tutorials/dependency-injection-with-dagger-2-on-android--cms-23345*/
public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
        vehicle.increaseSpeed(2);
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
