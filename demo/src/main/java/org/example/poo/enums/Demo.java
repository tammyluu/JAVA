package org.example.poo.enums;

public class Demo {
    public static void main(String[] args) {
        Priority priority =Priority.MEDIUM;

        switch (priority){
            case HIGH:
                System.out.println("High Priority");
                break;
            case MEDIUM:
                System.out.println("MEDIUM Priority");
                break;
            case lOW:
                System.out.println("Low Priority");
                break;
        }
    Priority priority1 = Priority.valueOf("HIGH");
    Priority[] values = Priority.values();
        for (Priority p: values
             ) {
            System.out.println("Enum: " + p);
        }


    }

}
