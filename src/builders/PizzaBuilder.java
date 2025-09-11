package builders;

import classes.Pizza;
import classes.enums.Cheese;
import classes.enums.Onion;
import classes.enums.Pepper;

import java.util.List;

public interface PizzaBuilder {
    void reset();
    PizzaConcreteBuilder setWaterVolume(Double waterVolume);
    PizzaConcreteBuilder setOliveOil(boolean oliveOil);
    PizzaConcreteBuilder setSalt(boolean salt);
    PizzaConcreteBuilder setSugar(boolean sugar);
    PizzaConcreteBuilder setCheese(Cheese cheese);
    PizzaConcreteBuilder setPeppers(List<Pepper> peppers);
    PizzaConcreteBuilder setOnions(List<Onion> onions);
    Pizza getResult();
}
