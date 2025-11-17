package Visitor.animal;

import Visitor.concrete.AnimalVisitor;

public interface Animal {
    void accept(AnimalVisitor animalVisitor);
}
