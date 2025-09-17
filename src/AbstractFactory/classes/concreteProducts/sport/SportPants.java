package AbstractFactory.classes.concreteProducts.sport;

import AbstractFactory.interfaces.Pants;

public class SportPants implements Pants {
    @Override
    public void wear() {
        System.out.println("wearing sport pants...");
    }
}
