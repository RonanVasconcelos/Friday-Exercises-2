package week2.IfStatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your last name? ");
        name = scanner.next();

        if (name.compareTo("Carswell") <= 0) {
            System.out.println("you don't have to wait long");
        } else if (name.compareTo("Jones") <= 0) {
            System.out.println("that's not bad");
        } else if (name.compareTo("Smith") <= 0) {
            System.out.println("looks like a bit of a wait");
        } else if (name.compareTo("Young") <= 0) {
            System.out.println("it's gonna be a while");
        } else if (name.compareTo("Young") > 0) {
            System.out.println("not going anywhere for a while?");
        }
    }

}
