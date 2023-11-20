package org.example;

import org.example.exofunctions.Function;

public class Main {
    public static void main(String[] args) {
        boolean result = Function.isPrime(0);
        System.out.println("0? " + result);
        System.out.println("9? " + Function.isPrime(9));
        System.out.println("13? " + Function.isPrime(13));
        System.out.println("101? " + Function.isPrime(101));
       Function.printPrimeList();
       // Function.print100FirstPrimes();
    }
}