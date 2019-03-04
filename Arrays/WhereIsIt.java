package week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Create an array that can hold ten integers, and fill each slot with a different random value from 1-50.
 * Display those values on the screen, and then prompt the user for an integer. Search through the array,
 * and if the item is present, give the slot number where it is located. If the value is not in the array,
 * display a single message saying so. If the value is present more than once,
 * you may either display the message as many times as necessary,
 * or display a single message giving the last slot number in which it appeared.
 */

public class WhereIsIt {
    public static void main(String[] args) {

        int[] array = new int[10];

        Random random = new Random();
        Scanner getTYped = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Value to find: ");
        int number = getTYped.nextInt();
        boolean find = false;

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println(array[i] + " is in the slot " + (i + 1));
                find = true;
                count++;
            }
        }

        if (count != 0) {
            //System.out.println("The value was found " + count + " times");
        } else if (find == false) {
            System.out.println("The value " + number + " is not in the array");
        }

    }
}

