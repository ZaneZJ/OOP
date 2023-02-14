package L2;

import java.util.Scanner;

public class OOPLa0201 {

    static Reverse rev = new Reverse();
    static HalfText ht = new HalfText();

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter text: ");
        String inputText = input.nextLine();
        System.out.println("Before:    " + inputText);

//        (1) Reversing the string:

        String reversedText = rev.reverse(inputText);
        System.out.println("Reversed:  " + reversedText);

//        (2) Result is a shortened text containing only characters with indexes 2, 4, 6, etc. from the given text.

        String halfOfTheText = ht.halftext(inputText);
        System.out.println("Half text: " + halfOfTheText);

    }

}
