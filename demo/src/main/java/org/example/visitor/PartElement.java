package org.example.visitor;

public interface PartElement {
    void accept(Visitor visitor);
}
