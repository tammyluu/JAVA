package org.example.abstractfactory;

import java.awt.*;

public class MacFactory extends GUIFactory {
    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    Checkbox createCheckbox() {
        return new MacCheckBox();
    }
}
