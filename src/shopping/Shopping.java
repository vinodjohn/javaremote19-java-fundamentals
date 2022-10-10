package shopping;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create class Product, it should contain at least two fields – name and price.
 * Create an empty array of Products – it’s size should be at least 5.
 * Populate the array with some products - this array represents the menu for the user.
 * <p>
 * Simulate the process of doing shopping:
 * ask for a product,
 * add it to the cart (array),
 * change index,
 * if index will be greater than 5 – finish shopping,
 * pay for the products.
 */
public class Shopping {

    /*
    Main menu:
            1. Shop products
        2. Shopping cart
        3. Exit
    Choose any option from above:
            1


    Products menu:
            0.
            1. Apple
        3. Exit to main menu
    Choose any product to add to cart
        1
    Quantity:
            3

    Cart menu:
            1. Show cart
        2. Pay to cart
        3. Exit to menu
    Choose any option from above:
            2
    Would you like to pay (54 EUR) (true/False)?
            true
    Okay. The payment is done.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainMenuOption = displayMainMenu();
        Cart cart = new Cart();

        switch (mainMenuOption) {
            case 1: // shop products
                boolean hasMoreShopping = false;
                int counter = 0;
                int cartLimit = 5;
                ProductLine[] products = new ProductLine[cartLimit]; // It can hold only 5 products

                do {
                    if (counter >= cartLimit) {
                        System.out.println("Your limit reached. Please proceed to pay!");
                        break;
                    }

                    ProductLine productLine = getProductToCart();
                    products[counter] = productLine;
                    cart.setProducts(products);
                    System.out.println("Do you want to shop more products?");
                    String errorMessage = "Incorrect answer. Please enter again:";
                    boolean checker = false;

                    do {
                        if (!scanner.hasNextBoolean()) {
                            System.out.println(errorMessage);
                            scanner.next();
                        } else {
                            hasMoreShopping = scanner.nextBoolean();
                            checker = true;
                        }
                    } while (!checker);

                    if (hasMoreShopping) {
                        counter++;
                    }
                } while (hasMoreShopping);

        }

        System.out.println(Arrays.toString(cart.getProducts()));
    }

    private static Product[] getRandomProducts() {
        Product fruit1 = new Product();
        fruit1.setName("Apple");
        fruit1.setPrice(14.00f);

        Product vegetable = new Product();
        vegetable.setName("Tomato");
        vegetable.setPrice(2.00f);

        Product food = new Product();
        food.setName("Pizza");
        food.setPrice(5.00f);

        Product chocolate = new Product();
        chocolate.setName("Kitkat");
        chocolate.setPrice(1.00f);

        Product chips = new Product();
        chips.setName("Lays");
        chips.setPrice(2.50f);

        return new Product[]{fruit1, vegetable, food, chocolate, chips};
    }

    private static int displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MAIN MENU \n----------------");
        System.out.println("1. Shop products \n2. Shopping cart \n3. Exit");
        System.out.println("Choose an option from above:");

        return getMenuOption(3);
    }

    private static ProductLine getProductToCart() {
        System.out.println("PRODUCT MENU \n----------------");

        // To get the random products to display
        Product[] products = getRandomProducts();

        // Displaying the products
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ". " + products[i].getName());
        }

        System.out.println(products.length + ". " + "Exit to main menu");

        // To get option for product
        System.out.println("Choose an option from above:");
        int productChoice = getMenuOption(products.length);

        if (productChoice == products.length) {
            return null; // No product is selected
        } else {
            System.out.println("Enter quantity:");
            Scanner scanner = new Scanner(System.in);
            float quantity = 0;
            String errorMessage = "Incorrect quantity! Please enter again:";

            do {
                if (!scanner.hasNextFloat()) {
                    System.out.println(errorMessage);
                    scanner.next();
                } else {
                    quantity = scanner.nextFloat();

                    if (quantity <= 0) {
                        System.out.println(errorMessage);
                    }
                }
            } while (quantity <= 0);


            // Price calculation
            float price = products[productChoice].getPrice() * quantity;

            //Creating product line for cart
            ProductLine productLine = new ProductLine();
            productLine.setProduct(products[productChoice]);
            productLine.setQuantity(quantity);
            productLine.setPrice(price);

            return productLine;
        }
    }

    private static int displayCartMenu() {
        System.out.println("CART MENU \n --------------");
        System.out.println("1. Show cart \n2. Pay \n3. Exit to main menu");
        System.out.println("Choose an option from above:");

        return getMenuOption(3);
    }

    private static int getMenuOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option! Please enter again:";
        int option = limit + 1;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt(); // correct input

                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);

        return option;
    }

}
