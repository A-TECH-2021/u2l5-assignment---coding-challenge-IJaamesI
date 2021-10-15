package main.java;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // variables for user inputs
        double taxRate;
        double boardCost = 8;
        double windowCost = 11;
        int numBoards;
        int numWindows;

        // asking user for input and setting values
        System.out.println("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = scanner.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = scanner.nextInt();


        // calling Construction class and set values
        Construction set = new Construction(boardCost, windowCost, taxRate);

        // finding total
        double total = set.lumberCost(numBoards) + set.windowCost(numWindows);
        System.out.println("Total: " + total);
        // finding grand total
        System.out.print("Grand Total: " + (total + (total * set.taxRate)));
        // close scanner
        scanner.close();
    }
}
