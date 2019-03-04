package week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot {
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
                System.out.println(array[i] + " is in the array" + " at the " + (i + 1) + "º position");
                find = true;
                count++;
            }
        }

        if(count != 0){
            System.out.println("The value was found " + count + " times");
        }else if (find == false) {
            System.out.println("The value " + number + " is not in the array");
        }
    }
}
