package exercises;

public class StatementExercises {

    public static void main(String[] args) {
        //Odd or even
        int i;

        // solution 1 - using if-else
        for (i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            } else {
                System.out.println(i + " is odd number");
            }
        }

        // solution 2 - using ternary operator
        for (i = 0; i <= 20; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + " number"); // i is even/odd number
        }


        //Leap year
        int year = 2022;

        // solution 1
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        //solution 2
        System.out.println(year + " is" + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : " not ") + "a leap year");


        //solution 3- simple!
        if (year % 4 == 0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("not leap year");
        }

        //FIZZBUZZ
        //Solution1

        int j = 15;

        if (j % 3 == 0 && j % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (j % 3 == 0) {
            System.out.println("FIZZ");
        } else if (j % 5 == 0) {
            System.out.println("BUZZ");
        }

        //solution 2
        //Homework3: one line solution for FIZZBUZZ


        // if
        // Write a Java program to find if the person is adult. (minimum adult age is 18)

        int myAge = 21;

        if (myAge >= 18) {
            System.out.println("The person is an adult");
        }

        //if-else
        //Write a Java program to print if the given number is odd or even
        int number = 2020;

        if (number % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is a odd number");
        }


        //if, else-if, else
        //Write a Java program to print if the string is empty, if the length is greater than 20 and if the string is null
        String test = "";

        if (test == "") {
            System.out.println("The given string is empty");
        } else if (test.length() > 20) {
            System.out.println("The given String is so long");
        } else if (test.length() < 20) {
            System.out.println("The given string is too short");
        } else if (test == null) {
            System.out.println("The string cannot be null");
        }


        //Switch
        // Write a java program to match the given alphabet
        char test2 = 'k';

        switch (test2) {
            case 'A':
                System.out.println("The given alphabet is A");
                break;
            case 'B':
                System.out.println("The given alphabet is B");
                break;
            case 'K':
                System.out.println("The given alphabet is K");
                break;
            default:
                System.out.println("The given alphabet is not found");
        }


        // For example
        for (int l = 1; l <= 50; l++) {
            if (l % 2 != 0) {
                System.out.println(l + " is an odd number");
            }
        }

    }
}
