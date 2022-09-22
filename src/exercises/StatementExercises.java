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
        if(year % 4 ==0) {
            System.out.println("This is leap year");
        } else {
            System.out.println("not leap year");
        }

        //FIZZBUZZ
        //Solution1

        int j= 15;

        if(j % 3 == 0 && j % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if(j % 3 == 0) {
            System.out.println("FIZZ");
        } else if(j % 5 == 0) {
            System.out.println("BUZZ");
        }

        //solution 2
        //Homework3: one line solution for FIZZBUZZ
    }
}
