package Factory.classes.concreteCreators;

import Factory.classes.Bike;
import Factory.interfaces.Vehicle;
import Factory.interfaces.VehicleFactory;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
