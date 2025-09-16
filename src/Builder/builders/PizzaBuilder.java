package Builder.builders;

import Builder.classes.Pizza;
import Builder.classes.enums.Cheese;
import Builder.classes.enums.Onion;
import Builder.classes.enums.Pepper;

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
