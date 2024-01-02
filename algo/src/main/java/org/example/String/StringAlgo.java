package org.example.String;

public class StringAlgo {
    public static void main(String[] args) {
        stringReverse();

        System.out.println("'TammyLuu' has all unique chars : "+ hasAllUniqueChars("TammyLuu"));

        System.out.println("'Academy' has all unique chars : "+ hasAllUniqueChars("academy"));

        System.out.println("'Shop' has all unique chars : "+ hasAllUniqueChars("shop"));

        System.out.println("'Software' has all unique chars : "+ hasAllUniqueChars("software"));

    }
    public static void stringReverse(){
        String text = "TammyLuu";
        text = text.toLowerCase();

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        System.out.println("Reverse of TammyLuu is: " + reverse);
    }
    public static boolean hasAllUniqueChars (String word) {

        for (int index = 0; index < word.length(); index++) {

            char c = word.charAt(index);

            if (word.indexOf(c) != word.lastIndexOf(c)) {

                return false;
            }
        }
        return true;
    }
}
