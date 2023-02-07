package L1;

/*
   Compute your weight on the moon.

   Call this file Moon.java.
*/

import java.util.Scanner;

public class Moon {

    public static void main(String args[]) {
        double earthweight; // weight on earth
        double moonweight; // weight on moon

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Earth weight: ");
        earthweight = input.nextDouble();

        // To moonweight and to pounds
        // 1 kg = 2.20462262 pounds
        moonweight = earthweight * 0.17 * 2.20462262;

        System.out.println(earthweight + " earth-kilograms is equivalent to " + moonweight + " moon-pounds.");

    }

}
