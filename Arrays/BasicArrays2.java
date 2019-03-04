package week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] tenInteger = new int[10];
        Random gerator = new Random();

        for (int i = 0; i < tenInteger.length; i++){
            tenInteger[i] = gerator.nextInt(100);
            System.out.printf("Slot %d contains a ", i );
            System.out.println(tenInteger[i]);
        }
    }
}
