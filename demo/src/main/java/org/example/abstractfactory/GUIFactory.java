package org.example.abstractfactory;

import java.awt.*;

public  abstract class GUIFactory {
    abstract Button createButton();
    abstract Checkbox createCheckbox();
}
