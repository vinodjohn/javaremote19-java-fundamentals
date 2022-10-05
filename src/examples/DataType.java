package examples;

/**
 * Examples of Primitive datatype
 *
 * @author Vinod John
 */
public class DataType {
    //Primitive Data types
    // Numbers
    int o;

    byte byteNumber = 120;
    short shortNumber = -32000;
    int a = 1;
    long longNumber = 545454681351L;


    float decimalNumber = 2f; // 2.0
    double doubleNumber = 3d;


    // Character
    char alpha = 'F';

    //True/False
    boolean hadLunch = true; // had lunch?
    boolean isHoliday = false;

    /* Multi-line
    comment
     */

    int i; // 0

    float x; // 0.00f

    char animal; // ''

    boolean isClassTomorrow;  // false
    
    
    //Non-primitive data types
    String word = "I'm a developer";
    
    Character random = 'u';
    
    Integer number = 5;
    
    Float numberSecond = 2.45F;
    
    Integer randomNumber;  // null

    // Multi-declaration
    int numberOne, numberTwo, numberThree;

    String fruit = "apple", vegetable = "pumpkin", cities;


    // Scope of class variables
    private static final String CAR = "Toyota";

    public static String FOOD = "Cake";


    public static void main(String[] args) {
        int k = 0;
        Integer y = null;
        System.out.println(k);

        k = 10;
        System.out.println(k);


        System.out.println(y);


        String _color = "black";

        int $hexaNumber = 0x2A;

        float exam12_mark = 100.10f;

        String className = "sda";

        int a = 100;
        int b = 0;

        int c = a + b;

        System.out.println(CAR);
        System.out.println(FOOD);

        k = 100;
    }


}
