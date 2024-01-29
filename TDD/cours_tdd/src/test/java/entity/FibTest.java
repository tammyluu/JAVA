package entity;

import org.example.entity.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibTest {

    @Test
    void testFibWithRang1IsNotEmpty(){
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assertions.assertFalse(result.isEmpty(), "Le résultat ne doit pas vide");

    }
    @Test
    void testFibWithRang1containList(){
        // Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assertions.assertEquals(Arrays.asList(0),result);
       // Assertions.assertEquals(List.of(0), result, "Le résultat devrait contenir la liste {0}");
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
    void testFibWithRang6ContainNumber6() {
       Fib fib = new Fib(6);

       List<Integer> result = fib.getFibSeries();

        Assertions.assertEquals(6,result.size() );
    }

    @Test
    void testFibWithRang6NotWithinNumber4() {

        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertFalse(result.contains(4) );
    }
    @Test
    void testFibWithRang6ContainAList() {
        Fib fib = new Fib(6);

       List<Integer> result = fib.getFibSeries();

       // Assertions.assertEquals(List.of(0,1,1,2,3,5), result);
        Assertions.assertTrue(result.containsAll(Arrays.asList(1,1,2,3,5,0)));
    }
    @Test
    void testFibWithRang6OderByAsc() {

        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();
        List<Integer> expected  = List.of(0, 1, 1, 2, 3, 5);

        Assertions.assertIterableEquals(expected, result);
       /* System.out.println(result);
        System.out.println(List.of(0, 1, 1, 2, 3, 5));*/
    }


}
