package Builder.builders;

import Builder.classes.Pizza;
import Builder.classes.enums.Cheese;
import Builder.classes.enums.Onion;
import Builder.classes.enums.Pepper;

import java.util.List;

public class PizzaConcreteBuilder implements Builder.builders.PizzaBuilder {
    private Pizza pizza;

    @Override
    public void reset() {
       this.pizza = new Pizza();
    }

    @Override
    public PizzaConcreteBuilder setWaterVolume(Double waterVolume) {
        this.pizza.setWaterVolume(waterVolume);
        return this;
    }

    @Override
    public PizzaConcreteBuilder setOliveOil(boolean oliveOil) {
        this.pizza.setOliveOil(oliveOil);
        return this;
    }

    @Override
    public PizzaConcreteBuilder setSalt(boolean salt) {
        this.pizza.setSalt(salt);
        return this;
    }

    @Override
    public PizzaConcreteBuilder setSugar(boolean sugar) {
        this.pizza.setSugar(sugar);
        return this;
    }

    @Override
    public PizzaConcreteBuilder setCheese(Cheese cheese) {
        this.pizza.setMozzarellaCheese(cheese);
        return this;
    }

    @Override
    public PizzaConcreteBuilder setPeppers(List<Pepper> peppers) {
        this.pizza.setPeppers(peppers);
        return this;
    }

    @Override
    public PizzaConcreteBuilder setOnions(List<Onion> onions) {
        this.pizza.setOnions(onions);
        return this;
    }

    @Override
    public Pizza getResult() {
        return this.pizza;
    }
}
