package week2.IfStatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {

        Scanner getTyped = new Scanner(System.in);
        System.out.println("What is your gender (M or F): ");
        String gender = getTyped.nextLine();

        System.out.println("What is your  first name: ");
        String firstName = getTyped.nextLine();

        System.out.println("What is your  last name: ");
        String lastName = getTyped.nextLine();

        System.out.println("What is your age: ");
        int age = getTyped.nextInt();

        Scanner getIn = new Scanner(System.in);
        System.out.println("Are you Married? (y or n)");
        String married = getIn.nextLine();

        if (gender.equals("F")) {
            if (age >= 20) {
                if (married.equals("y")) {
                    System.out.println("Then I shall call you Mrs." + lastName);
                } else {
                    System.out.println("Then I shall call you Ms. " + lastName);
                }

            } else {
                System.out.println("Then I shall call you " + firstName + " " + lastName);
            }


        }else{
            if(age >= 20){
                System.out.println("Then I shall call you Mr. " +lastName);
            }else{
                System.out.println("Then I shall call you " + firstName + " " + lastName);
            }
        }

    }
}
