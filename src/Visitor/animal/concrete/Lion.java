package Visitor.animal.concrete;

import Visitor.animal.Animal;
import Visitor.concrete.AnimalVisitor;

public class Lion implements Animal {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
