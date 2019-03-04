package week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that creates an array which can hold ten values. Fill the array with random numbers from 1 to 100.
 * Display the values in the array on the screen. Then use a linear search to find the largest value in the array, and display that value.
 */

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        Scanner getTYped = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int largest = 0;

        for (int i = 0; i < array.length; i++){
            for(int j = 1; j <array.length -1; j++){
                if(array[i] > array[j]){
                    largest = array[i];
                }else{
                    largest = array [j];
                }
            }
        }

        System.out.println("The largest value is " + largest);

    }
}
