package AbstractFactory.classes.concreteProducts.casual;

import AbstractFactory.interfaces.Shirt;

public class CasualShirt implements Shirt {
    @Override
    public void wear() {
        System.out.println("wearing casual shirt...");
    }
}
