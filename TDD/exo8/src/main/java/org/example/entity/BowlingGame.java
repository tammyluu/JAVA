package org.example.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BowlingGame {

    private static final int MAX_THROWS = 2;

    private PinGenerator pinGenerator;

    private int score = 0;
    private int throwsCount = 0;
    private List<Integer> throwsResults = new ArrayList<>();
    private boolean includeNextRollInScore = false;

    public BowlingGame(PinGenerator pinGenerator){
        this.pinGenerator = pinGenerator;

    }

    public void roll(int pins) {

        if (throwsCount < MAX_THROWS) {
            // Ajoute le nombre de quilles renversées au score
            score += pins;
            throwsResults.add(pins);
            System.out.println(throwsResults);
            if (isSpare() && throwsCount % 2 == 0) {
                // Si c'est un spare, ajoute également le résultat du prochain lancer au score
                score += pins ;
                System.out.println(score);

            }

            throwsCount++;
            System.out.println(throwsResults);
        }
        System.out.println("pins: " + pins);
        System.out.println("throwsResults: " + throwsResults);
        System.out.println("throwsCount: " + throwsCount);
        System.out.println("score: " + score);

        // System.out.println("Score: " + score + ", Throws Count: " + throwsCount + ", Throws Results: " + throwsResults);

    }

    public int score(){
        int totalScore = score;

        if (isSpare() && includeNextRollInScore) {
            // Si le dernier lancer était un spare, ajoute le résultat du prochain lancer au score
            totalScore += throwsResults.get(throwsResults.size() - 1);
            // Réinitialise l'indicateur
            includeNextRollInScore = false;
        }

        return totalScore;
    }


    public int keepingScoreRound() {
        if (throwsCount % 2 == 0) {
            // If even number of throws, return the current score
            return score;
        } else {
            // If odd number of throws, return the current score plus the score of the previous throw
            return score + lastThrowScore();
        }
    }

    private int lastThrowScore() {
        // Implement logic to retrieve the score of the last throw
        // In this example, assume each throw scores the same as the number of pins knocked down
        return score - throwsCount % 2;
    }


    public boolean canRollAgain() {
        return throwsCount < MAX_THROWS || (throwsCount == MAX_THROWS && isSpare());

    }
    private boolean isSpare() {
        return throwsResults.size() >= 2 &&
                throwsResults.get(throwsResults.size() - 1) + throwsResults.get(throwsResults.size() - 2) == 10;
    }



}
