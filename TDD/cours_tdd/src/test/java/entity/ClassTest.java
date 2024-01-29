package entity;

import org.example.entity.Tools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.tools.Tool;

public class ClassTest {
    @Test
    void testIfNumberEven(){
        Tools tools = new Tools();
        boolean res = tools.isEven(2);
        Assertions.assertTrue(res);
    }
    @Test
    void testIfNumberOdd(){
        Tools tools = new Tools();
        boolean res = tools.isEven(3);
        Assertions.assertFalse(res);
    }
}
