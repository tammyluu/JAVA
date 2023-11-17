package org.example;

import org.example.exofunctions.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("100 : " + Function.isPrime(100));
        System.out.println("101 : " + Function.isPrime(101));
       // Function.printPrimeList();
        Function.print100FirstPrimes();
    }
}