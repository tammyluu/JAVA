package org.example.exofunctions;

public class Function {
    public static boolean isPrime (int n){
        if (n < 2)
        return false;
        if (n ==2)
        return true;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if ( n % i  == 0)
                return  false;

        return true;
    }
    public static void printPrimeList(){
        System.out.println(" the list of primes from 1 ...1000 is : ");
        for (int i = 1; i <= 1000; i++)
            if (isPrime(i) == true)
            System.out.print(i + " "  );
    }
    public static void print100FirstPrimes(){
        int count = 0;
        for (int i = 1;i <= 1000;i++)
            count = i++;
            if (isPrime(i) && count <= 100)
                System.out.print( i + " ");
    }
}
