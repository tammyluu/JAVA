package org.example.entity.random;

import lombok.Data;

import java.util.Random;
@Data
public class RealDice implements Dice {

    private Random random;

    public RealDice() {
        random = new Random();
    }
    public  int getValue() {
        return random.nextInt(1,7);
    }
}
