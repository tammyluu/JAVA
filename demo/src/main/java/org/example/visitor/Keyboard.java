package org.example.visitor;

public class Keyboard implements PartElement{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
