package org.example.enums;

public enum TypeMessage {
    A(Priority.HIGH),
    B(Priority.MEDIUM),
    C(Priority.LOW),
    D(Priority.LOW);

    private final Priority priority;

    TypeMessage(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}