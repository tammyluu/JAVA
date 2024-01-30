package org.example.entity.random_string;

import lombok.Data;

import java.util.Random;
@Data
public class RandomWord implements  WordGenerator{
    private  Random random;

    public RandomWord() {
       random = new Random();
    }

    @Override
    public String getRandomWord(String[] words) {
        int index = random.nextInt(words.length);
        return words[index];
    }
}
