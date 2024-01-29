package entity;

import org.example.entity.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FibTest {

    //Le résultat n’est pas vide
    //Le résultat correspond à une liste qui contient {0}
    @Test
    void testFibWithRang1IsNotEmpty(){
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assertions.assertFalse(result.isEmpty(), "Le résultat ne doit pas vide");
       // Assertions.assertEquals(List.of(0), result, "Le résultat devrait contenir la liste {0}");
    }
    @Test
    void testFibWithRang1containList(){
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
         Assertions.assertEquals(List.of(0), result, "Le résultat devrait contenir la liste {0}");
    }

@Test
void testFibWithRang6ContainNumber3() {
    // Arrange
    Fib fib = new Fib(6);

    // Act
    List<Integer> result = fib.getFibSeries();

    // Assert
    Assertions.assertTrue(result.contains(3) );
}
    @Test
    void testFibWithRang6Contain6Number() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assertions.assertEquals(6,result.size() );
    }

    @Test
    void testFibWithRang6NotWithinNumber4() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assertions.assertFalse(result.contains(4) );
    }
    @Test
    void testFibWithRang6ContainAList() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assertions.assertEquals(List.of(0,1,1,2,3,5), result);
    }
    @Test
    void testFibWithRang6OderByAsc() {
        // Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assertions.assertIterableEquals(List.of(0, 1, 1, 2, 3, 5), result);
    }


}
