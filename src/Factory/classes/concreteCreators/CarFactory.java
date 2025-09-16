package Factory.classes.concreteCreators;

import Factory.classes.Car;
import Factory.interfaces.Vehicle;
import Factory.interfaces.VehicleFactory;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
