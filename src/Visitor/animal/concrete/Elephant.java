package Visitor.animal.concrete;

import Visitor.animal.Animal;
import Visitor.concrete.AnimalVisitor;

public class Elephant implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
