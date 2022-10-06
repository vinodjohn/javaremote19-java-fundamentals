package strings;

import java.util.Scanner;

/**
 * To write a java program to change string to upper case
 *
 * @author Vinod John
 */
public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());
    }
}
