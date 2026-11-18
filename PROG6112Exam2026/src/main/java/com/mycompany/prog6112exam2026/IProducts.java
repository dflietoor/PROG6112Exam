/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prog6112exam2026;

/**
 *
 * @author Dimpho Flietoor
 */
//Question 1
public interface IProducts {
    //gets the total amount of products sold
   int GetTotalProductsSold();
   
   //gets the average amount of the products sold
   double GetAverageProductSold();
   
   //displays the most populat mattress
   String GetMostPopularProduct();
}
