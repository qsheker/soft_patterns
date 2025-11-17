package Visitor.concrete;

import Visitor.animal.concrete.Elephant;
import Visitor.animal.concrete.Lion;

public class AnimalFeedVisitor implements AnimalVisitor{

    @Override
    public void visit(Lion lion) {
        System.out.println("Feeding the lion...");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Feeding the elephant...");
    }
}
