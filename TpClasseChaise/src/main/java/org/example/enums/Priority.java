package org.example.enums;

public enum Priority {
    HIGH("High Priority"),
    MEDIUM("MEDIUM Priority"),
    LOW("Low Priority");

    private final String priority;

    Priority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}