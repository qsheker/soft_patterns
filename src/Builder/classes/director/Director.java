package Builder.classes.director;

import Builder.builders.PizzaConcreteBuilder;
import Builder.classes.Pizza;
import Builder.classes.enums.Cheese;
import Builder.classes.enums.Onion;

import java.util.List;

public class Director {
    public Pizza makeDefaultPizza(PizzaConcreteBuilder pizzaBuilder){
        pizzaBuilder.reset();
        pizzaBuilder.setCheese(Cheese.FRESH);
        pizzaBuilder.setOliveOil(true);
        pizzaBuilder.setOnions(List.of(Onion.RED_ONION,Onion.YELLOW_ONION));
        pizzaBuilder.setSalt(true);
        pizzaBuilder.setSugar(false);
        pizzaBuilder.setWaterVolume(50D);
        return pizzaBuilder.getResult();
    }
}
