package Factory.classes;

import Factory.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("driving a car...");
    }
}
