package strings;

import java.util.Scanner;

/**
 * To check a given word is a palindrome
 *
 * @author Vinod John
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();

        //MADAM
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));
        }

        if(word.equalsIgnoreCase(reverseWord.toString())) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
