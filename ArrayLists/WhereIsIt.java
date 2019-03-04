package week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50.
 * Display those values on the screen, and then prompt the user for an integer. Search through the ArrayList,
 * and if the item is present, give the slot number where it is located. If the value is not in the ArrayList, display a single message saying so.
 * If the value is present more than once, you may either display the message as many times as necessary,
 * or display a single message giving the last slot number in which it appeared.
 */

public class WhereIsIt {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 9; i++){
            int num = random.nextInt(50);
            numbers.add(num);
        }

        System.out.println("ArrayList: " + numbers);

        System.out.println("Value to find : ");
        int value = getTyped.nextInt();

        int slot = 0;
        boolean found = false;
        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (value == numbers.get(i)) {
                found = true;
                slot = i;
                count++;
                System.out.println(String.format("%d is in the array at the %d slot.", value, i));
            }

        }

        if (found == true){
            System.out.println(String.format("The last time where the number %d appear is in slot %d.", value  , slot));
        }

        if (count != 0){
            System.out.println(String.format("%d was found %d times.", value, count));
        }
        else if (count  == 0)
        {
            System.out.println(String.format("%d is not in the ArrayList.", value));
        }
    }
}
