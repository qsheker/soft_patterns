package AbstractFactory.classes.concreteFactories;

import AbstractFactory.classes.concreteProducts.casual.CasualPants;
import AbstractFactory.classes.concreteProducts.casual.CasualShirt;
import AbstractFactory.classes.concreteProducts.casual.CasualShoes;
import AbstractFactory.interfaces.ClothesFactory;
import AbstractFactory.interfaces.Pants;
import AbstractFactory.interfaces.Shirt;
import AbstractFactory.interfaces.Shoes;

public class CasualFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new CasualShirt();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }
}
