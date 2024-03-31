package assignment6;

import java.util.*;

public class Calculator {
	
	public static double calculateFine(int daysLate) {
        if (daysLate <= 7) {
            return 0.5 * (daysLate);
        } else if (daysLate <= 14) {
            return 1 * (daysLate - 7);
        } else {
            return 5;
        }
    }

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = sin.nextInt();

        double fine = calculateFine(daysLate);

        if (fine == 0) {
            System.out.println("No fine. Thank you for returning the book on time!");
        } else if (fine==5) {
            System.out.println("Your membership has been canceled due to excessive delay.");
        } else {
            System.out.println("Fine: Rs. " + fine);
        }
        
        scanner.close();
    }

    
}