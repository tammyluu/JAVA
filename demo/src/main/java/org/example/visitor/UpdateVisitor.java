package org.example.visitor;

public class UpdateVisitor implements Visitor{
    @Override
    public void visit(Keyboard keyBoard) {
        System.out.println("update keyboard element "+keyBoard);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("update monitor element "+monitor);
    }
}
