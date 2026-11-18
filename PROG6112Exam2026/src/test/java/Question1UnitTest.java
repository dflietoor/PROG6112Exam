/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prog6112exam2026.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dimpho Flietoor
 */
//question 1
public class Question1UnitTest {
    
    public Question1UnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

  

public class ProductTest {

    // UNIT TEST 1
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product();

        int actual = product.GetTotalProductsSold();

        int expected = 153;

        assertEquals(expected, actual);

    }

    // UNIT TEST 2
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product();

        double actual = product.GetAverageProductSold();

        double expected = 17.0;

        assertEquals(expected, actual, 0.001);

    }
}
}

