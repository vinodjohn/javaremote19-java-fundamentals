package shopping;

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
    public static void main(String[] args) {
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

        Product[] products = {fruit1, vegetable, food, chocolate, chips};

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ". " + products[i].getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose any product to add to cart:");
        int productChoice = scanner.nextInt();

        Product[] cart = {};
        cart[0] = products[productChoice];
    }

}
