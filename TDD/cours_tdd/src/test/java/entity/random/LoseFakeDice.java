package entity.random;

import org.example.entity.random.Dice;

public class LoseFakeDice implements Dice {
    @Override
    public int getValue() {
        return 3;
    }
}
