/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112exam2026;

/**
 *
 * @author Dimpho Flietoor
 */

//Question 1
import java.util.Scanner;

//This class implements methods from the IProducts interface
public class Product implements IProducts {

    // allows the user to enter information
    private Scanner input = new Scanner(System.in);

    // 2D array for 3 products and 3 months
    private int[][] sales = new int[3][3];

    // Single array for product totals
    private int[] productTotals = new int[3];

    // Product names in a single array
    private String[] productNames = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    // Constructor
    public Product() {

        // Ask the user to enter sales for each product
        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                System.out.println("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + " mattress:");

                sales[i][j] = input.nextInt();

                // Calculate total for each product
                productTotals[i] += sales[i][j];

            }
        }
    }

    // Calculate total products sold
    //@Override shows the methods that are from the Interface class
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < productTotals.length; i++) {

            total += productTotals[i];

        }

        return total;
    }

    // Calculate average products sold
    @Override
    public double GetAverageProductSold() {

        return (double) GetTotalProductsSold() / 9;

    }

    // Finds the most popular mattress
    @Override
    public String GetMostPopularProduct() {

        int highestIndex = 0;

        for (int i = 1; i < productTotals.length; i++) {

            if (productTotals[i] > productTotals[highestIndex]) {

                highestIndex = i;

            }
        }

        return productNames[highestIndex] + " (" + productTotals[highestIndex] + ")";

    }

}
