package org.example.entity.random_string;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class LePendu {
    private WordGenerator wordGenerator;
    private String wordToGuess;
    private StringBuilder mask;
    private Set<Character> guessedLetters;

    public LePendu(WordGenerator wordGenerator, int i) {
        this.wordGenerator = wordGenerator;
        this.wordToGuess = wordGenerator.getRandomWord(new String[]{});
        this.mask = new StringBuilder("_".repeat(wordToGuess.length()));
        this.guessedLetters = new HashSet<>();
    }
    public String generateMask() {
        return mask.toString();
    }

   /* public boolean isCharInWord(char guess) {
        boolean isCharInWord = wordToGuess.indexOf(guess) != -1;

        if (isCharInWord) {
            updateMask(guess);
        }

        return isCharInWord;
    }*/
   public boolean isCharInWord(char guessedChar) {
       // Vérifie si la lettre a déjà été devinée
       if (guessedLetters.contains(guessedChar)) {
           System.out.println("Lettre déjà devinée : " + guessedChar);
           return false;
       }

       guessedLetters.add(guessedChar); // Enregistre la lettre devinée

       // Initialize a new mask string
       StringBuilder newMask = new StringBuilder(mask);

       boolean charInWord = false;
       for (int i = 0; i < wordToGuess.length(); i++) {
           if (wordToGuess.charAt(i) == guessedChar) {
               newMask.setCharAt(i, guessedChar);
               charInWord = true;
           }
       }

       // Update the mask
       mask = newMask;

       // Check if the player has won
       if (!mask.toString().contains("_")) {
           System.out.println("Le joueur a gagné !");
           return true;
       }

       return charInWord;
   }


   /* private void updateMask(char guess) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                mask.setCharAt(i, guess);
            }
        }

    }*/

    public boolean isPlayerWin() {
        return !mask.toString().contains("_");
    }
}
