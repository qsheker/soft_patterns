import classes.Director;
import classes.Pizza;
import builders.PizzaConcreteBuilder;

public class Main {
    public static void main(String[] args) {
        Director director =  new Director();
        PizzaConcreteBuilder pizza = new PizzaConcreteBuilder();
        Pizza defaultPizza = director.makeDefaultPizza(pizza);
        System.out.println(defaultPizza.toString());



    }
}
