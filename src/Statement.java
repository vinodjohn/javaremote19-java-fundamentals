/**
 * Statement examples
 *
 * @author Vinod John
 */
public class Statement {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;
        String name = "Vinod";

        if (name == "Vinod" && name != "Michael") {
            System.out.println("The name is correct");
        }

        if ((i > y && y > 0) || i == 100) {
            System.out.println("i is greater than y");
        }

        System.out.println("This is a simple program");

        /*
        if(shirt size == M && shirt color == black) {
         // buy the shirt
        }
         */


        /*
        if(shirt size == M && shirt color == black) {
         // buy the shirt
        }  else {
        // buy the shirt from other shop
        }
         */

        if (i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.println("y is greater than i");
        }

        /*
        if(shirt size == M && shirt color == black) {
         // buy the shirt
        } else if(shirt size == M && shirt color == blue) {
         // buy the shirt
        } else {
        // buy the shirt from other shop
        }
         */

        if (i > y) {
            System.out.println("i is greater than y");
        } else if (i < 9) {
            System.out.println("i is lesser");
        } else {
            System.out.println("i is invalid");
        }



        /* SWITCH
            If we want to one condition for multiple values.
         */
        int x = 10;
        int j = 6;
        int z = x + j; // 11

        switch (z) {
            case 10:
            case 11:
                System.out.println("The value of z is 11");
                break;
            case 12:
                System.out.println("The value is 12");
            default:
                System.out.println("Default block executed!");

        }

        String color = "Red";

        switch (color) {
            case "Red":
                System.out.println("I'm Red");
                break;
            case "white":
                System.out.println("I'm white");
                break;
        }


        int grade = 5;
        switch (grade) {
            case 10: // 5 == 10
                System.out.println("Super Star!");
                break;
            case 9:
            case 7:
                System.out.println("Hm, Not bad!");
                break;
            case 5: // 5 == 5
                System.out.println("You passed");
            case 4:
                System.out.println("You failed");
                break;
            default:
                System.out.println("Invalid  grade");
        }


        // WHILE (Entry-check loop)
        int money = 0;

        while (money <= 5) {
            System.out.println("Doing job. Money = " + money);
            money++; // money = money + 1
        }

        // Do-WHILE (exit-check loop)
        do {
            System.out.println("money =" + money);
            money += 10; // money = money + 10
        } while(money < 100);

        //FOR
        for (int g = 0; g <= 6; g++) {
            System.out.println("g value is: " + g);
        }

    }
}
