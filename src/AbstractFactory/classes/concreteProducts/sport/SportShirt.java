package AbstractFactory.classes.concreteProducts.sport;

import AbstractFactory.interfaces.Shirt;

public class SportShirt implements Shirt {
    @Override
    public void wear() {
        System.out.println("wearing sport shirt...");
    }
}
