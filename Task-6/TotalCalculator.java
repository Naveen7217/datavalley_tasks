

import java.util.*;

public class TotalCalculator {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = sin.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = sin.nextDouble();

        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);

        System.out.println("Total expenses: Rs. " + totalExpenses);

        sin.close();
    }

    public static double calculateTotalExpenses(int quantity, double pricePerItem) {
        double totalExpenses = quantity * pricePerItem;

        if (quantity > 50) {
            totalExpenses *= 0.9; // 10% discount calculation
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses *= 0.95; // 5% discount calculation
        }

        return totalExpenses;
    }
}
