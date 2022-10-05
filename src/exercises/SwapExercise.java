package exercises;

/**
 * Program to swap the values of the variable
 *
 * @author Vinod John
 */
public class SwapExercise {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int temp;

        System.out.println("a: " + a + " b: " + b);

        temp = a; // temp = 15
        a = b; // a = 25
        b = temp; // b = 15

        System.out.println("a: " + a + " b: " + b);

        //clear garbage collection (optional)
        System.gc();
    }
}
