package basics;

import java.util.Scanner;

/**
 * To read two numbers from the user, add and print the result of sum
 *
 * @author Vinod John
 */
public class InputSum {
    public static void main(String[] args) {
        // To get input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to Sum:");

        System.out.println("Enter number 1:");
        int num1 = scanner.nextInt();

        System.out.println("Enter number 2:");
        int num2 = scanner.nextInt();

        // Sum
        int sum = num1 + num2;
        System.out.println("Sum is:" + sum);
    }
}
