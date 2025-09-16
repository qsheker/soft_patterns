package Factory.classes;

import Factory.interfaces.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void drive() {
        System.out.println("driving a bus...");
    }
}
