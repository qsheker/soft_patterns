package Factory.classes;

import Factory.interfaces.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("driving a bike...");
    }
}
