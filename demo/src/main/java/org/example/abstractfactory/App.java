package org.example.abstractfactory;

import org.example.poo.enums.Priority;

import java.awt.*;

public class App {
    private  Button button;
    private Checkbox checkbox;
    public  App (GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
}
