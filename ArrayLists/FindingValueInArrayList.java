package week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50.
 * Display those values on the screen, and then prompt the user for an integer. Search through the ArrayList, and if the item is present, say so.
 * It is not necessary to display anything if the value was not found.
 * If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once.
 */


public class FindingValueInArrayList {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            int num = 1 + random.nextInt(50);
            numbers.add(num);
        }

        System.out.println("ArrayList: " + numbers);

        System.out.println(" Value to find : ");
        int value = getTyped.nextInt();

        boolean find = false;

        for (int l = 0; l < numbers.size(); l++) {
            if (value == numbers.get(l)) {
                find = true;
                System.out.println(String.format("%d is in the array at the %d slot.", value, l));
            }

        }
    }
}
