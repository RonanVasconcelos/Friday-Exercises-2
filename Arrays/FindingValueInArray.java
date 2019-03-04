package week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
 Display those values on the screen, and then prompt the user for an integer. Search through the array, and if the item is present, say so.
 It is not necessary to display anything if the value was not found.
 If the item is in the array multiple times, it's okay if the program prints the message more than once
 */
public class FindingValueInArray {
    public static void main(String[] args) {

        int[] array = new int[10];

        Random random = new Random();
        Scanner getTYped = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Value to find: ");
        int number = getTYped.nextInt();
        boolean find = false;

        for(int i = 0; i < array.length; i++){
            if(number == array[i]){
                find = true;
                System.out.println(array[i] +" is in the array" +"at the " +(i+1) + "º position");
                break;
            }
        }
        if(find == false){
            System.out.println("The value " +number +" is not in the array");
        }



    }
}
