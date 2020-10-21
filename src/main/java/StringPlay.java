import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.lang.Object;

public class StringPlay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String input = scan.nextLine();
        System.out.println("You entered \""+input+"\".");
//        Tells whether or not what the user entered is a number
        if (!StringUtils.isNumeric(input)) {
            System.out.println(input + " is not numeric");
        } else {
            System.out.println(input + " is numeric!");
        }
//        Flips the case of the string
        System.out.println(StringUtils.swapCase(input));
//        Reverses the string
        System.out.println("Reverse: " + StringUtils.reverse(input));


    }
}
