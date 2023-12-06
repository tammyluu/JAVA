package org.example.abstractfactory;

import java.awt.*;

public class WinFactory  extends  GUIFactory{
    @Override
    Button createButton() {
        return new WinButton();
    }

    @Override
    Checkbox createCheckbox() {
        return new WinCheckBox();
    }
}
