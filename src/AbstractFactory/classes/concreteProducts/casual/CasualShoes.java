package AbstractFactory.classes.concreteProducts.casual;

import AbstractFactory.interfaces.Shoes;

public class CasualShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("wearing casual shoes...");
    }
}
