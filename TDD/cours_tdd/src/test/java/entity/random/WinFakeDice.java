package entity.random;

import org.example.entity.random.Dice;

public class WinFakeDice implements Dice {
    @Override
    public int getValue() {
        return 4;
    }
}
