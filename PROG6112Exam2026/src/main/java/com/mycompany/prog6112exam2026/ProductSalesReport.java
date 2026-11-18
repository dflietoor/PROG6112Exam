/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112exam2026;

/**
 *
 * @author Dimpho Flietoor
 */
//Question 1
//main class that prints the complete report
public class ProductSalesReport {

    public static void main(String[] args) {

        // Create Product object
        Product product = new Product();

        // Create PrintProduct object
        PrintProduct report = new PrintProduct(product);

        // Display the report
        report.printReport();
                

    }
}
 

