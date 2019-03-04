package week2.ArrayLists;

/**Create an ArrayList of Integers. Fill up the list with ten random numbers, each from 1 to 100.
 *  Then display the contents of the ArrayList on the screen.
 You must use a loop to fill up the list. However, you may display it the easy way (no loop needed) like so:
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayL = new ArrayList<>();

        Random random = new Random();

        for(int i = 0; i <= 9; i++){

            int a = random.nextInt(50);
            arrayL.add(a);
        }

        System.out.println(arrayL);

    }
}
