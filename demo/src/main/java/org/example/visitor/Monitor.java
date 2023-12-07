package org.example.visitor;

public class Monitor implements PartElement{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
