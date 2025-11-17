package Visitor.concrete;

import Visitor.animal.concrete.Elephant;
import Visitor.animal.concrete.Lion;

public interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Elephant elephant);
}
