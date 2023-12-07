package org.example.visitor;

public interface Visitor {

    void visit(Keyboard keyBoard);
    void visit(Monitor monitor);
}

