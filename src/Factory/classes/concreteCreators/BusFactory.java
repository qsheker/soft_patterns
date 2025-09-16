package Factory.classes.concreteCreators;

import Factory.classes.Bus;
import Factory.interfaces.Vehicle;
import Factory.interfaces.VehicleFactory;

public class BusFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }
}
