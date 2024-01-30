/*
package entity;

import org.example.entity.City;
import org.example.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductTest {
    private Product product;

    @Test
    void productQualityAndSellInDecrement() {

       product = new Product(" ProductA", 10, 20);

       product.update();

       // Assertions.assertEquals(9, product.getSellIn());
        Assertions.assertEquals(19, product.getQuality());
    }
    @Test
    void productQualityDegradesTwiceAsFastAfterExpiration() {

       Product expiredProduct = new Product("Expired Product", 0, 10);

       expiredProduct.update();

       //Assertions.assertEquals(-1, expiredProduct.getSellIn());
       Assertions.assertEquals(8, expiredProduct.getQuality());
    }
    @Test
    void productQualityProductIsNeverNegative() {

        product = new Product("ProductB", 3, 0);
        for (int i = 0; i < 5; i++) {
            product.update();
        }

        product.update();
        //Assertions.assertEquals(0, product.getSellIn());
        Assertions.assertEquals(0, product.getQuality());
    }
    @Test
    void productQualityIsNeverNegativeRaiseNullPointerException() {
        product = new Product(null, 5, 10);
        Assertions.assertThrowsExactly(NullPointerException.class,() ->{
            product.update();
        });

    }
    @Test
    void productUpdateThrowsIllegalArgumentExceptionForNegativeQuality() {

        Product product = new Product("Product D", 5, -2);

        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            product.update();
        }, "Expected IllegalArgumentException to be thrown");
    }

    void productQualityIsNeverHigherThan50() {
        Product product = new Product("ProductC", 3, 49);
    // supposant pendant 5 jours
        for (int i = 0; i < 5; i++) {
            product.update();
        }

              Assertions.assertTrue(product.getQuality() <= 50);

    }
    @Test
    void agedBrieQualityIncreasesWithAge() {
        Product agedBrie = new Product("Aged Brie", 5, 20);

          agedBrie.update();

        Assertions.assertTrue(agedBrie.getQuality() > 20);
    }


}
*/
