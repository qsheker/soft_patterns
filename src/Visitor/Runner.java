package Visitor;

import Visitor.animal.Animal;
import Visitor.animal.concrete.Elephant;
import Visitor.animal.concrete.Lion;
import Visitor.concrete.AnimalFeedVisitor;
import Visitor.concrete.AnimalVisitor;

public class Runner {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();

        AnimalVisitor feedVisitor = new AnimalFeedVisitor();

        lion.accept(feedVisitor);
        elephant.accept(feedVisitor);
    }
}
