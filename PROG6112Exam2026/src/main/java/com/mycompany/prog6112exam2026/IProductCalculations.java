package com.mycompany.prog6112exam2026;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dimpho Flietoor
 */
//Question 2

public interface IProductCalculations {
    //calculates VAT
    double GetVat();
    
    //calculates the Commission earned
    double GetCommission();
    
    //calculates the total amount including the commission
    double GetTotal();
}
