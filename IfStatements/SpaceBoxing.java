package week2.IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);

        System.out.println("Please enter your current earth weight: ");
        double weight = getTyped.nextDouble();

        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus   2. Mars    3. Jupiter");
        System.out.println("4. Saturn  5. Uranus  6. Neptune");
        System.out.println("");
        System.out.println("Which planet are you visiting?");
        int planet = getTyped.nextInt();

        System.out.println();

        switch (planet){
            case 1:
                //System.out.println(String.format("Your weight would be %.2f on that planet!", (weight * 0.78)));
                System.out.printf("Your weight would be %.2f on that planet!", (weight * 0.78));
                break;
            case 2:
                System.out.printf("Your weight would be %.2f on that planet!",(weight * 0.39));
                break;
            case 3:
                System.out.printf("Your weight would be %.2f on that planet!", (weight * 2.65));
                break;
            case 4:
                System.out.printf("Your weight would be %.2f on that planet!", (weight * 1.17));
                break;
            case 5:
                System.out.printf("Your weight would be %.2f on that planet!", (weight * 1.05));
                break;
            case 6:
                System.out.printf("Your weight would be %.2f on that planet!", (weight * 1.23));
                break;
        }
    }
}
