package week2.IfStatements;

import java.util.Scanner;

public class ChooseYourOwnShortAdventure {
    public static void main(String[] args) {

        Scanner getIn1 = new Scanner(System.in);
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
        String choice1 = getIn1.next();
//------ 1 Kitchen or upstairs ------------------------------------------------------------------------------------------
        if (choice1.equals("kitchen") || choice1.equals("Kitchen")) {
            Scanner getIn2 = new Scanner(System.in);
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"or look in a \"cabinet\".");
            String choice2 = getIn2.nextLine();


            if (choice2.equals("refrigerator") || choice2.equals("Refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
                Scanner getIn3 = new Scanner(System.in);
                String choice3 = getIn3.nextLine();

                if (choice3.equals("Yes") || choice3.equals("yes")) {
                    System.out.println("You found the lost key.!");


                } else if (choice3.equals("No") || choice3.equals("no")) {
                    System.out.println("You die of starvation... eventually");
                }


            } else if (choice2 == "cabinet" || choice2 == "Cabinet") {
                System.out.println("You found the lost key.!");
            }

//------ 1 Kitchen or upstairs ------------------------------------------------------------------------------------------
        } else if (choice1.equals("upstairs") || choice1.equals("Upstairs")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?");
            Scanner getIn21 = new Scanner(System.in);
            String choice21 = getIn21.nextLine();

            if(choice21.equals("Bedroom") || choice21.equals("bedroom")){
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
                Scanner getIn22 = new Scanner(System.in);
                String choice22 = getIn22.nextLine();

                if(choice22.equals("Yes") || choice22.equals("yes")){
                    System.out.println("You found the lost key!");

                }else if(choice22.equals("No") || choice22.equals("no")){
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements.");
                }


            }else if(choice21.equals("Bathoom") || choice21.equals("bathroom")){
                System.out.println("You found the lost key.");

            }


        }


    }
}
