package AbstractFactory.classes.concreteProducts.casual;

import AbstractFactory.interfaces.Pants;

public class CasualPants implements Pants {
    @Override
    public void wear() {
        System.out.println("wearing casual pants...");
    }
}
