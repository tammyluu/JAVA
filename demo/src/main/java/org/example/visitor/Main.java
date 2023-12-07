package org.example.visitor;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.accept(new UpdateVisitor());
    }
}
