/**
 * Examples of Arrays
 *
 * @author Vinod John
 */
public class Array {
    public static void main(String[] args) {
        int a = 9;

        //Single-dimensional array
        //Note: Array index always starts with 0
        //infinite arrays

        //int array
        int[] b = {9, 27, 40, 20, 839, 11000, 27, 40};

        //String array
        String[] fruits = {"apple", "orange", "mango", "apple", "banana", "mango"}; // index = 0, 1, 2,...

        System.out.println(fruits[0]);
        System.out.println(b[4]);

        // System.out.println(fruits[3]); //Array index out of bound

        System.out.println(b.length); //return the number of values in the array

        System.out.println(b.length - 1); //returns array's last index

        //defined array
        String[] veggies = new String[5]; // new object

        veggies[3] = "Potato";
        veggies[4] = "Carrot";

        System.out.println(veggies[1]);

        String[] food = new String[]{"cake", "porridge", "rice"};

        int[] ageArray = new int[3];


        //processing array
        //conventional for-loop
        for (int i = 0; i < fruits.length; i++) {  // i = index of array
            System.out.println(fruits[i]);
        }

        //enhanced for-loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Find the largest element in the array
        // Brute-force method
        int result = b[0]; // 9

        for (int x : b) {
            if(x > result) {
                result = x;
            }
        }

        System.out.println(result);



        // Homework4
        // To find smallest element in the array (b)
    }
}
