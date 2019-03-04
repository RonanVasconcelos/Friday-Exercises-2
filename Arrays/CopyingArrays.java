package week2.Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Write a program that creates an array of ten integers. It should put ten random numbers from 1 to 100 in the array.
 * It should copy all the elements of that array into another array of the same size. Then display the contents of both arrays.
 * To get the output to look like mine, you'll need a several for loops.
 *
 * Create an array of ten integers
 * Fill the array with ten random numbers (1-100)
 * Copy the array into another array of the same capacity
 * Change the last value in the first array to a -7
 * Display the contents of both arrays
 */

public class CopyingArrays {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];


        Random random = new Random();

        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(100);
        }

        array2 = array1;

        System.out.println("Array 2: "+Arrays.toString(array2));
        array1[9] = -7;
        System.out.println("Array 1: "+Arrays.toString(array1));


    }
}
