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
public class PrintProduct {

    private Product product;

    // this is a constructor
    public PrintProduct(Product product) {

        this.product = product;

    }

    // shows the total amount of sales
    public void printTotalProductSales() {

        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());

    }

    // shows the average amount of sales
    public void printAverageProductSales() {

        System.out.println("AVERAGE PRODUCT SALES: " + product.GetAverageProductSold());

    }

    // shows the most popular item sold
    public void printMostPopularProduct() {

        System.out.println("MOST POPULAR PRODUCT: "+ product.GetMostPopularProduct());

    }

    // Shows the complete report
    public void printReport() {

        System.out.println();
        System.out.println("===============================");
        System.out.println("PRODUCT SALES REPORT FOR 2026");
        System.out.println("===============================");

        printTotalProductSales();

        printAverageProductSales();

        printMostPopularProduct();

    }
    
}

   

