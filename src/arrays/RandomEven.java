package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Write a program that does the following(the code should be written in separate methods):
 * <p>
 * Generated an array with 10 elements random between 0 and 99. (See Random class in java).
 * Display the generated array.
 * Display only the odd numbers.
 * Display only the even numbers.
 */

public class RandomEven {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 99;
        final int arrayLimit = 10;

        int[] array = new int[arrayLimit];

        // Task 1
        for (int i = 0; i < arrayLimit; i++) {
            array[i] = getRandomNumber(min, max);
        }

        System.out.println("Random array");
        displayArray(array);

        displayOddArray(array);

        displayEvenArray(array);
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private static void displayArray(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }

    //To print only odd numbers of array
    private static void displayOddArray(int[] inputArray) {
        List<Integer> oddArrayList = new ArrayList<>();

        for(int number: inputArray) {
            if(number % 2 != 0) {
                oddArrayList.add(number);
            }
        }

        System.out.println("Odd numbers of the array:");

    }


    //To print even numbers of array
    private static void displayEvenArray(int[] inputArray) {
        List<Integer> evenArrayList = new ArrayList<>();

        for(int number: inputArray) {
            if(number % 2 == 0) {
                evenArrayList.add(number);
            }
        }

        System.out.println("Even numbers of the array:");
        displayArray(convertListToArray(evenArrayList));
    }
    
    private static int[] convertListToArray (List<Integer> intList) {
        int[] result = new int[intList.size()];

        for (int i = 0; i < intList.size(); i++) {
            result[i] = intList.get(i);
        }

        return result;
    }
}
