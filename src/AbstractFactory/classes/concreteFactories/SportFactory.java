package AbstractFactory.classes.concreteFactories;

import AbstractFactory.classes.concreteProducts.sport.SportPants;
import AbstractFactory.classes.concreteProducts.sport.SportShirt;
import AbstractFactory.classes.concreteProducts.sport.SportShoes;
import AbstractFactory.interfaces.ClothesFactory;
import AbstractFactory.interfaces.Pants;
import AbstractFactory.interfaces.Shirt;
import AbstractFactory.interfaces.Shoes;

public class SportFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Pants createPants() {
        return new SportPants();
    }

    @Override
    public Shoes createShoes() {
        return new SportShoes();
    }
}
