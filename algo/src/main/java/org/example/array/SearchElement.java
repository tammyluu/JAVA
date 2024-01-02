package org.example.array;

public class SearchElement {
    public  static int [] arr = new int[] { 12, 56, 76, 89, 100, 343, 21, 234 };
    public static void main(String[] args) {
        theLargestAndSmallestNumberinArray();

        int secondHighest=findSecondLargestNumberInTheArray(arr);

        System.out.println("Second largest element in the array : "+ secondHighest);
    }
    public   static void  theLargestAndSmallestNumberinArray(){

        int smallest = arr[0];

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                largest = arr[i];

            }

            else if (arr[i] < smallest) {

                smallest = arr[i];

            }

        }

        System.out.println("The Smallest Number of array  is : " + smallest);

        System.out.println(" The Largest Number of array is : " + largest);
    }
    public static int findSecondLargestNumberInTheArray(int[] array) {

        int highest = Integer.MIN_VALUE;

        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > highest) {

                secondHighest = highest;

                highest = array[i];

            } else if (array[i] > secondHighest && array[i] != highest)

                secondHighest = array[i];

        }

        return secondHighest;
    }
}
