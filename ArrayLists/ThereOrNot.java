package week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Create an ArrayList of Integers, and fill each slot with a different random value from 1-50.
 * Display those values on the screen, and then prompt the user for an integer.
 * Search through the ArrayList, and if the item is present, say so.
 * If the value is not in the ArrayList, display a single message saying so.
 * Just like the previous assignment, if the value is present more than once, you may display the message as many times as necessary.
 */
public class ThereOrNot {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i <= 9 ; i++){
            int num = random.nextInt(50);
            numbers.add(num);
        }
        System.out.println("ArrayList: " + numbers);
        System.out.println("Value to find : ");

        int value = getTyped.nextInt();

        boolean find = false;

        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (value == numbers.get(i)) {
                find = true;
                count++;
                System.out.println(String.format("%d is in the array at the %d slot.", value, i));
            }

        }
        if (count != 0)
        {
            System.out.println(String.format("\n%d was found %d times.", value, count));
        }
        else if (count  == 0)
        {
            System.out.println(String.format("\n%d is not in the ArrayList.", value));
        }
    }
}
