package strings;

import java.util.Scanner;

/**
 * To write a program to check if the string has another string
 *
 * @author Vinod John
 */
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter a search word:");
        String searchWord = scanner.nextLine();

        if (sentence.contains(searchWord)) {
            System.out.println("Word matches");
        } else {
            System.out.println("Word mismatch!");
        }
    }
}
