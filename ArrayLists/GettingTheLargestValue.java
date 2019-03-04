package week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Write a program that creates an ArrayList which can hold Integers. Fill the ArrayList with random numbers from 1 to 100.
 * Display the values in the ArrayList on the screen. Then use a linear search to find the largest value in the ArrayList, and display that value.
 */

public class GettingTheLargestValue {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 9; i++)
        {
            int num = random.nextInt(100);
            numbers.add(num);
        }
        System.out.println("ArrayList: " + numbers);

        int largest = 0;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) > numbers.get(largest)){
                largest = i;
            }
        }
        int toPrint = numbers.get(largest);

        System.out.println(String.format("The largest value is %d.", toPrint));
        System.out.println(String.format("It is in slot %d.", largest));
    }
}
