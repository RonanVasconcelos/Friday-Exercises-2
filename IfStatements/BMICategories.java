package week2.IfStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner getTyped = new Scanner(System.in);

        System.out.println("What's your height in m: ");
        double height = getTyped.nextDouble();

        System.out.println("What's your weight in kg:");
        double weight = getTyped.nextDouble();

        double bmi = weight / (height * height);
        DecimalFormat df = new DecimalFormat("##.##");


        if(bmi < 18.5){
            System.out.println("Your BMI is: " +df.format(bmi));
            System.out.println("Your category is underweight");
        }else if( bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Your BMI is: " +df.format(bmi));
            System.out.println("Your category is normal weight");
        }else if( bmi >= 25 && bmi <= 29.9){
            System.out.println("Your BMI is: " +df.format(bmi));
            System.out.println("Your category is overweight");
        }else if(bmi > 30){
            System.out.println("Your BMI is: " +df.format(bmi));
            System.out.println("Your category is obese");
        }




    }
}
