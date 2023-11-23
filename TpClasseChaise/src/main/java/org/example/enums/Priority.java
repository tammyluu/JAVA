package org.example.enums;

public enum Priority {
    HIGH("High Priority"),
    MEDIUM("MEDIUM Priority"),
    LOW("Low Priority");

    private final String label;

    Priority(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}