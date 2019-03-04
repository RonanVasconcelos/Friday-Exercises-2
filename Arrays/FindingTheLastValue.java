package week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class FindingTheLastValue {


    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);
        Random random = new Random();
        int num[] = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        int largest = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[largest]) {
                largest = i;
            }
        }
        int numberToPrint = num[largest];
        System.out.println(String.format("\nThe largest value is %d.", numberToPrint));
    }

}
