package AbstractFactory.classes.concreteProducts.sport;

import AbstractFactory.interfaces.Shoes;

public class SportShoes implements Shoes {
    @Override
    public void wear() {
        System.out.println("wearing sport shoes...");
    }
}
