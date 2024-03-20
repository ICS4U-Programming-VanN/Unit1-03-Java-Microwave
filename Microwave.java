/**
 * Microwave.java
 *
 * @author Van
 * @version 1.0
 * @since 2024/03/21
 */
import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for item choice
        System.out.println("Welcome to the microwave!");
        System.out.println("Choose an item: sub, pizza, or soup");
        String item = scanner.nextLine();

        // Validate item choice
        int baseTime = 0;
        switch (item) {
            case "sub":
                baseTime = 60;
                break;
            case "pizza":
                baseTime = 45;
                break;
            case "soup":
                baseTime = 105; // 1 minute 45 seconds
                break;
            default:
                System.out.println("Invalid item choice!");
                return;
        }

        // Ask the user for the quantity
        System.out.println("Enter the quantity (max 3):");
        int quantity;
        if (scanner.hasNextInt()) {
            quantity = scanner.nextInt();
        } else {
            System.out.println("Invalid input for quantity!");
            return;
        }

        // Validate quantity
        if (quantity < 1 || quantity > 3) {
            System.out.println("Invalid quantity!");
            return;
        }

        // Apply time adjustments based on quantity
        if (quantity == 2) {
            baseTime = (int) (baseTime * 1.5);
        } else if (quantity == 3) {
            baseTime *= 2;
        }

        // Display the heating time
        System.out.println("Heating " + quantity + " " + item + "(s) will take " + baseTime + " seconds.");
    }
}
