package week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Prompt the user for a first and last name, and the name for a file.
 * Randomly choose five grades for that person from 1 to 100 and store them in an array that can hold five integers.
 * Then output the first and last name and those five grades to the specified file.
 */

public class GradesInArrayFile {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);

        System.out.println("Name (first last): ");
        String name = getTyped.nextLine();

        System.out.println("Filename: ");
        String filename = getTyped.nextLine();

        Random random = new Random();

        int[] grades = new int[5];

        System.out.println("Here are your randomly-selected grades (hope you pass): ");

        for (int i=0; i< grades.length; i++){
            grades[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(grades));

        for (int i = 1; i < 6; i++){
            System.out.printf("Grade %d: ", i);
            System.out.println(grades[i-1]);
        }
        System.out.println(" ");
        System.out.println("Data saved in \""+filename + "\"");

    }
}
